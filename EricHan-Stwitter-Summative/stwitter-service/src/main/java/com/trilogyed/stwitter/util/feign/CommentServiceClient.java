package com.trilogyed.stwitter.util.feign;

import com.trilogyed.stwitter.dto.Comment;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "comment-service")

public interface CommentServiceClient {

    @RequestMapping (value = "/comments/comments/{poster_id}", method = RequestMethod.GET)
    public List<Comment> getCommentByPostId(@PathVariable("post_id") int id);


}
