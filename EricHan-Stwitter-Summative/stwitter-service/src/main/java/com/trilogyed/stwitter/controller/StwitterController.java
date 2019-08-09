package com.trilogyed.stwitter.controller;

import com.trilogyed.stwitter.ViewModel.CommentViewModel;
import com.trilogyed.stwitter.ViewModel.PostViewModel;
import com.trilogyed.stwitter.exception.NotFoundException;
import com.trilogyed.stwitter.service.ServiceLayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RefreshScope
@CacheConfig(cacheNames = {"posts"})
public class StwitterController {


    @Autowired
    ServiceLayer service;

    public StwitterController(ServiceLayer service) {
        this.service = service;
    }

    @CachePut(key = "#result.getId()")
    @RequestMapping(value ="/posts", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public PostViewModel createPost(@RequestBody @Valid PostViewModel postViewModel) {
        return service.addPost(postViewModel);
    }

    @Cacheable
    @RequestMapping(value = "/posts/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public PostViewModel getPost(@PathVariable("id") int postId){
        PostViewModel postViewModel = service.getPost(postId);
        if (postViewModel == null) {
            throw new NotFoundException("Post can't be retrieved by the provided ID: " + postId);
        }

        return postViewModel;
    }

    @RequestMapping(value = "/posts/user/{poster_name}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<PostViewModel> getPostByPoster(@PathVariable("poster_name") String posterName) {

        List<PostViewModel> postViewModels = service.getPostByPoster(posterName);
        if(postViewModels.size() == 0) {
            return null;
        }
        return postViewModels;
    }


    // still need - #comments.getPostID();

}
