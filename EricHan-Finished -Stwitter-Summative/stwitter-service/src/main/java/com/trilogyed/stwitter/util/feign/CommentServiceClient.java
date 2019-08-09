package com.trilogyed.stwitter.util.feign;

import com.trilogyed.stwitter.dto.Comment;
import com.trilogyed.stwitter.dto.Post;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;

@FeignClient(name = "comment-service")

public interface CommentServiceClient {

    // get comments by post_ID
    @RequestMapping (value = "/comments/comments/{poster_id}", method = RequestMethod.GET)
    List<Comment> getCommentByPostId(@PathVariable("post_id") int commentId);


    // add comments
    @RequestMapping (value = "/comments", method = RequestMethod.POST)
    public Comment addComment(@RequestBody @Valid Comment comment);


    // get all comments
    @RequestMapping(value = "/comments", method = RequestMethod.GET)
    public List<Comment> getAllComment();

    // delete comment
    @RequestMapping(value= "/comments/{id}", method = RequestMethod.DELETE)
    public void deleteComment(@PathVariable("id") int commentId);


    // update comment
    @RequestMapping(value = "/comments/{id}", method = RequestMethod.PUT)
    public Comment updateComment(@PathVariable("id") int postId, @RequestBody Comment comment);

    // get comments
    @RequestMapping(value = "/comments/{id}", method = RequestMethod.GET)
    public Comment getComment(@PathVariable("id") int commentId);
}
