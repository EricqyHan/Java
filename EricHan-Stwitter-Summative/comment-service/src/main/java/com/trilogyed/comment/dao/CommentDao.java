package com.trilogyed.comment.dao;

import com.trilogyed.comment.model.Comment;

import java.util.List;

public interface CommentDao {

    Comment getComment(int id);
    List<Comment> getAllComments();
    Comment addComment(Comment comment);
    void updateComment(Comment comment);
    void deleteComment(int id);
    List<Comment> getCommentByPostId(int id);


}
