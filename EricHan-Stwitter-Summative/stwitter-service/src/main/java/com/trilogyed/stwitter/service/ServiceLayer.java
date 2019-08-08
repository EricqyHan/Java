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

@Component
public class ServiceLayer {

    private PostServiceClient postServiceClient;

    public CommentServiceClient commentServiceClient;

    private RabbitTemplate rabbitTemplate;

    // First Queue
    public static final String COMMENT_EXCHANGE = "comment-exchange";

    // Second Queue
    public static final String ROUTING_KEY = "note.book.serviceLayer";


    @Autowired
    public ServiceLayer(PostServiceClient postServiceClient, CommentServiceClient commentServiceClient, RabbitTemplate rabbitTemplate) {
        this.postServiceClient = postServiceClient;
        this.commentServiceClient = commentServiceClient;
        this.rabbitTemplate = rabbitTemplate;
    }

    public ServiceLayer() {
    }


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


    public PostViewModel getPost(int postId) {
        Post post = postServiceClient.getPost(postId);
        if (post == null) {
            throw new IllegalArgumentException("Post can't be retrieved by id: " + postId);
        }
        PostViewModel postViewModel = buildPostViewModel(post);
        return postViewModel;
    }



    // Helper Methods

    private PostViewModel buildPostViewModel(Post post){
        PostViewModel postViewModel = new PostViewModel();

        postViewModel.setPostID(post.getPostID());
        postViewModel.setPost(post.getPost());
        postViewModel.setPostDate(post.getPostDate());
        postViewModel.setPosterName(post.getPosterName());

        return postViewModel;
    }

    private CommentViewModel buildCommentViewModel(Comment comment){
        CommentViewModel commentViewModel = new CommentViewModel();

        commentViewModel.setCommentId(comment.getCommentId());
        commentViewModel.setPostId(comment.getPostId());
        commentViewModel.setCreateDate(comment.getCreateDate());
        commentViewModel.setComment(comment.getComment());

        return commentViewModel;
    }

}
