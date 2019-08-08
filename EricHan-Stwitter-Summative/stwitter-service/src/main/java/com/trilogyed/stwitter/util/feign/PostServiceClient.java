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

    @RequestMapping (value = "/notes/book/{book_id}", method = RequestMethod.GET)
    public List<Post> getPostByPoster(@PathVariable("post_id") int id);

    @RequestMapping (value = "/posts/{id}", method = RequestMethod.GET)
    public Post getPost( @PathVariable("id") int postId);

    @RequestMapping (value = "/posts", method = RequestMethod.POST)
    public Post addPost(@RequestBody @Valid Post post);


}
