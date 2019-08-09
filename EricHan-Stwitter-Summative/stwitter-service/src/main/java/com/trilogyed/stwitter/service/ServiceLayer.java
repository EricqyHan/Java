package com.trilogyed.stwitter.service;

import com.trilogyed.stwitter.ViewModel.CommentViewModel;
import com.trilogyed.stwitter.ViewModel.PostViewModel;
import com.trilogyed.stwitter.dto.Comment;
import com.trilogyed.stwitter.dto.Post;
import com.trilogyed.stwitter.util.feign.CommentServiceClient;
import com.trilogyed.stwitter.util.feign.PostServiceClient;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Component
public class ServiceLayer {

    private PostServiceClient postServiceClient;

    public CommentServiceClient commentServiceClient;

    private RabbitTemplate rabbitTemplate;

    // First Queue
    public static final String COMMENT_EXCHANGE = "comment-exchange";
    public static final String ROUTING_KEY = "comment.create.newComment";


    @Autowired
    public ServiceLayer(PostServiceClient postServiceClient, CommentServiceClient commentServiceClient, RabbitTemplate rabbitTemplate) {
        this.postServiceClient = postServiceClient;
        this.commentServiceClient = commentServiceClient;
        this.rabbitTemplate = rabbitTemplate;
    }

    public ServiceLayer() {
    }



    // Add Method
    @Transactional
    public PostViewModel addPost(PostViewModel postViewModel) {
        Post post = new Post();
        post.setPostDate(postViewModel.getPostDate());
        post.setPosterName(postViewModel.getPosterName());
        post.setPost(postViewModel.getPost());

        post = postServiceClient.addPost(post);
        postViewModel = buildPostViewModel(post);

        return postViewModel;
    }

    @Transactional
    public PostViewModel addComment(CommentViewModel commentViewModel, int postId) {

        Post post = postServiceClient.getPost(postId);
        if (post == null) {
            throw new IllegalArgumentException("Post can be retrieved by id: " + postId);
        }

        Comment comment = new Comment();
        comment.setPostId(commentViewModel.getPostId());
        comment.setCreateDate(commentViewModel.getCreateDate());
        comment.setCommenterName(commentViewModel.getCommenterName());
        comment.setComment(commentViewModel.getComment());

        rabbitTemplate.convertAndSend(COMMENT_EXCHANGE, ROUTING_KEY, comment);

        try {
            Thread.sleep(3000L);
        }catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }

        PostViewModel postViewModel = buildPostViewModel(post);

        return postViewModel;
    }


    public PostViewModel getPost(int postId) {
        Post post = postServiceClient.getPost(postId);
        if (post == null) {
            throw new IllegalArgumentException("Post can't be retrieved by id: " + postId);
        }
        PostViewModel postViewModel = buildPostViewModel(post);
        return postViewModel;
    }


    public List<PostViewModel> getPostByPoster(String posterName) {

        PostViewModel postViewModel = new PostViewModel();

        List<Post> posts = postServiceClient.getPostByPoster(posterName);

        List<PostViewModel> postViewModelList = new ArrayList<>();
        for (Post post : posts) {
            postViewModelList.add(buildPostViewModel(post));
        }

        if (postViewModelList.size() == 0) {
            throw new IllegalArgumentException("Posts can't be found for user: " + posterName);
        }

        return postViewModelList;
    }


    // Helper Methods

    private PostViewModel buildPostViewModel(Post post){
        PostViewModel postViewModel = new PostViewModel();

        postViewModel.setPostID(post.getPostID());
        postViewModel.setPost(post.getPost());
        postViewModel.setPostDate(post.getPostDate());
        postViewModel.setPosterName(post.getPosterName());

        List<Comment> comments = commentServiceClient.getCommentByPostId(postViewModel.getPostID());
        List<CommentViewModel> commentVMList = new ArrayList<>();

        for (Comment c : comments) {
            commentVMList.add(buildCommentViewModel(c));
        }

        postViewModel.setComments(commentVMList);

        return postViewModel;
    }

    private CommentViewModel buildCommentViewModel(Comment comment){
        CommentViewModel commentViewModel = new CommentViewModel();

        commentViewModel.setCommentId(comment.getCommentId());
        commentViewModel.setPostId(comment.getPostId());
        commentViewModel.setCreateDate(comment.getCreateDate());
        commentViewModel.setCommenterName(comment.getCommenterName());
        commentViewModel.setComment(comment.getComment());

        return commentViewModel;
    }

}
