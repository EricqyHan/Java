package com.trilogyed.stwitter.util.feign;

import com.trilogyed.stwitter.dto.Post;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;

@FeignClient(name = "post-service")
public interface PostServiceClient {

    //get post by poster name
    @RequestMapping (value = "/notes/book/{book_id}", method = RequestMethod.GET)
    List<Post> getPostByPoster(@PathVariable("post_id") String posterName);

    //get post by id
    @RequestMapping (value = "/posts/{id}", method = RequestMethod.GET)
    Post getPost( @PathVariable("id") int postId);

    //get all post
    @RequestMapping(value = "/posts", method = RequestMethod.GET)
    List<Post> getAllPost();

    //add post
    @RequestMapping (value = "/posts", method = RequestMethod.POST)
    Post addPost(@RequestBody @Valid Post post);

    //delete post
    @RequestMapping(value = "/posts/{id}", method = RequestMethod.DELETE)
    void deletePost(@PathVariable("id") int postId);


}
