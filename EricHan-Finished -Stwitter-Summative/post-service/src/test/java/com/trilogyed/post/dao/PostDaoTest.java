package com.trilogyed.post.dao;

import com.trilogyed.post.model.Post;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.time.LocalDate;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class PostDaoTest {

    @Autowired
    PostDao dao;

    @Before
    public void setUp() throws Exception {
        //clean out the test db
        List<Post> postList = dao.getAllPosts();
        postList.stream().forEach(post -> dao.delete(post.getPostID()));
    }

    @Test
    public void addGetDelete() {
        Post post = new Post();
        post.setPostDate(LocalDate.of(1990, 9, 11));
        post.setPosterName("Shao");
        post.setPost("I hope this works!");

        post = dao.addPost(post);

        Post post1 = dao.getPost(post.getPostID());

        assertEquals(post1, post);

        dao.delete(post.getPostID());

        post1 = dao.getPost(post.getPostID());

        assertNull(post1);
    }

    @Test
    public void getAllPosts() {
        Post post = new Post();
        post.setPostDate(LocalDate.of(1990, 9, 11));
        post.setPosterName("Shao");
        post.setPost("I hope this works!");

        dao.addPost(post);

        post = new Post();
        post.setPostDate(LocalDate.of(1990, 9, 11));
        post.setPosterName("Shao");
        post.setPost("I hope this works!");

        dao.addPost(post);

        List<Post>postList = dao.getAllPosts();

        assertEquals(postList.size(), 2);

    }

    @Test
    public void getPostByPoster() {
        Post post = new Post();
        post.setPostDate(LocalDate.of(1995, 9, 11));
        post.setPosterName("Hans");
        post.setPost("This works!");

        post = dao.addPost(post);

        List<Post> postList = dao.getPostByPoster(post.getPosterName());
        assertEquals(postList.size(), 1);
        assertEquals(postList.get(0), post);

    }

    @Test
    public void updatePost() {
        Post post = new Post();
        post.setPostDate(LocalDate.of(1990, 11, 8));
        post.setPosterName("Shao Lin");
        post.setPost("Something on facebook");

        post = dao.addPost(post);

        post.setPostDate(LocalDate.of(1995, 11, 8));
        post.setPosterName("Shao Han");
        post.setPost("Something on Xanga");

        dao.updatePost(post);

        Post post2 = dao.getPost(post.getPostID());

        assertEquals(post2, post);

    }

}