package com.trilogyed.comment.controller;

import com.trilogyed.comment.dao.CommentDao;
import com.trilogyed.comment.model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class CommentController {

    @Autowired
    CommentDao commentDao;


    //Create comment
    @RequestMapping(value = "/comments", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Comment createPost(@RequestBody Comment comment) {
        //return postDao.addPost(post);
        return commentDao.addComment(comment);
    }

    // get comment
    @RequestMapping(value = "/comments/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Comment getPost(@PathVariable int id) {
        Comment comment = commentDao.getComment(id);
        return comment;
    }


    //update
    @RequestMapping(value = "/comments/{id}", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updatePost(@PathVariable("id") int id, @RequestBody @Valid Comment comment) {
        comment.setCommentId(id);
        commentDao.updateComment(comment);
        if(id!=comment.getCommentId()){
            throw new IllegalArgumentException("Note id doesn't match request body!");
        }
    }


    //delete comment
    @RequestMapping(value = "/comments/{id}", method = RequestMethod.DELETE)
    public void deletePost(@PathVariable int id) {
        commentDao.deleteComment(id);
    }

    //get all
    @RequestMapping (value = "/comments", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Comment> findAllComments(){
        return commentDao.getAllComments();
    }

    //get post by comment
    @RequestMapping (value = "/comments/comments/{poster_id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Comment> findCommentsByPosterName(@PathVariable("poster_id") int id) {
        return commentDao.getCommentByPostId(id);
        //return null;
    }


}
