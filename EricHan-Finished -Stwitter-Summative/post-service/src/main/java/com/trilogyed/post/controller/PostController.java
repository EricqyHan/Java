package com.trilogyed.post.controller;

import com.trilogyed.post.dao.PostDao;
import com.trilogyed.post.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class PostController {

    @Autowired
    PostDao postDao;

    //Create post
    // working
    @RequestMapping(value = "/posts", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Post createPost(@RequestBody  Post post) {
        return postDao.addPost(post);
    }

    // get post
    // working
    @RequestMapping(value = "/posts/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Post getPost(@PathVariable int id) {
        Post post = postDao.getPost(id);
        return post;
    }


    //update
    // working
    @RequestMapping (value = "/posts/{id}", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updatePost(@PathVariable("id") int id, @RequestBody @Valid Post post) {
        post.setPostID(id);
        postDao.updatePost(post);
        if(id!=post.getPostID()){
            throw new IllegalArgumentException("Note id doesn't match request body!");
        }
    }



    //delete post
    //working
    @RequestMapping(value = "/posts/{id}", method = RequestMethod.DELETE)
    public void deletePost(@PathVariable int id) {
        postDao.delete(id);
    }


    //get all - not working
    @RequestMapping (value = "/posts", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Post> findAllPost(){
        return postDao.getAllPosts();
    }

    //get post by poster name - not working
    @RequestMapping (value = "/posts/poster/{poster_name}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Post> findPostByPosterName(@PathVariable("poster_name") String posterName) {
        return postDao.getPostByPoster(posterName);
    }


}


