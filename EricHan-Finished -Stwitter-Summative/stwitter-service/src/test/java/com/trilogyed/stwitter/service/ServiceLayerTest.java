package com.trilogyed.stwitter.service;

import com.trilogyed.stwitter.ViewModel.PostViewModel;
import com.trilogyed.stwitter.dto.Comment;
import com.trilogyed.stwitter.dto.Post;
import com.trilogyed.stwitter.util.feign.CommentServiceClient;
import com.trilogyed.stwitter.util.feign.PostServiceClient;
import org.junit.Before;
import org.junit.Test;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;

@SpringBootTest
public class ServiceLayerTest  {

    public static final String ROUTING_KEY = "comment.create.newComment";
    public static final String COMMENT_EXCHANGE = "comment-exchange";


    private CommentServiceClient commentServiceClient;
    private PostServiceClient postServiceClient;
    private RabbitTemplate rabbitTemplate;
    private ServiceLayer serviceLayer;


    @Before
    public void setUp() throws Exception{
        setUpCommentServiceMock();
        setUpPostServiceMock();
        setUpRabbitTemplate();

        serviceLayer = new ServiceLayer(postServiceClient, commentServiceClient, rabbitTemplate);
    }


    @Test
    public void testAddAndGetPost() {
        PostViewModel postViewModel = new PostViewModel();

        postViewModel.setPost("My Post");
        postViewModel.setPostDate(LocalDate.of(1990, 9, 11));
        postViewModel.setPosterName("Shao");

        postViewModel = serviceLayer.addPost(postViewModel);

        Post post = new Post();
        post.setPostID(postViewModel.getPostID());
        post.setPostDate(postViewModel.getPostDate());
        post.setPosterName(postViewModel.getPosterName());
        post.setPost(postViewModel.getPosterName());

        PostViewModel postViewModelTest = serviceLayer.getPost(post.getPostID());
        Post pTest = new Post();
        pTest.setPostID(postViewModelTest.getPostID());
        pTest.setPostDate(postViewModelTest.getPostDate());
        pTest.setPosterName(postViewModel.getPosterName());
        pTest.setPost(postViewModelTest.getPost());

        assertEquals(post, pTest);

    }

    @Test
    public void testGetPostByPoster() {

        PostViewModel postViewModel = new PostViewModel();

        postViewModel.setPost("My Post");
        postViewModel.setPostDate(LocalDate.of(1990, 9, 11));
        postViewModel.setPosterName("Shao");

        postViewModel = serviceLayer.addPost(postViewModel);

        Post post = new Post();
        post.setPostID(postViewModel.getPostID());
        post.setPostDate(postViewModel.getPostDate());
        post.setPosterName(postViewModel.getPosterName());
        post.setPost(postViewModel.getPost());

        List<PostViewModel> postViewModelsTest = serviceLayer.getPostByPoster(post.getPosterName());
        assertEquals(1, postViewModelsTest.size());


    }

    public void setUpCommentServiceMock(){
        commentServiceClient = mock(CommentServiceClient.class);

        Comment comment = new Comment();
        comment.setCommentId(1);
        comment.setPostId(1);
        comment.setCreateDate(LocalDate.of(1990, 9, 11));
        comment.setCommenterName("Shao");
        comment.setComment("My Post");

        Comment comment1 = new Comment();
        comment1.setPostId(1);
        comment1.setCreateDate(LocalDate.of(1990, 9, 11));
        comment1.setCommenterName("Shao");
        comment1.setComment("My Post");

        List<Comment> comments = new ArrayList<>();
        comments.add(comment);


        doReturn(comments).when(commentServiceClient).getCommentByPostId(1);
        doReturn(comments).when(commentServiceClient).getAllComment();
        doReturn(comment).when(commentServiceClient).getComment(1);

    }


    public void setUpPostServiceMock() {
        postServiceClient = mock(PostServiceClient.class);

        Post post = new Post();
        post.setPostID(1);
        post.setPosterName("Shao");
        post.setPostDate(LocalDate.of(1990, 9, 11));
        post.setPost("My Post");

        Post post1 = new Post();
        post1.setPosterName("Shao");
        post1.setPostDate(LocalDate.of(1990, 9, 11));
        post1.setPost("My Post");

        List<Post> posts = new ArrayList<>();
        posts.add(post);

        doReturn(posts).when(postServiceClient).getAllPost();
        doReturn(posts).when(postServiceClient).getPostByPoster("Shao");
        doReturn(post).when(postServiceClient).getPost(1);
        doReturn(post).when(postServiceClient).addPost(post1);

    }



    public void setUpRabbitTemplate() {
        rabbitTemplate = mock(RabbitTemplate.class);
    }
}