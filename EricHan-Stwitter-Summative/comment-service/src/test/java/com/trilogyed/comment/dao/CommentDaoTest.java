package com.trilogyed.comment.dao;

import com.trilogyed.comment.model.Comment;
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
public class CommentDaoTest {

    @Autowired
    CommentDao commentDao;


    @Before
    public void setUp() throws Exception {
        //Clean up the test DB
        List<Comment> comments = commentDao.getAllComments();
        for(Comment comment : comments) {
            commentDao.deleteComment(comment.getCommentId());
        }
    }

    @Test
    public void addAndGetComments() {
        Comment comment = new Comment();

        comment.setPostId(3);
        comment.setCreateDate(LocalDate.of(1994, 4, 10));
        comment.setCommenterName("Mr. Terrible at this");
        comment.setComment("FML");

        //comment from dao.add
        comment = commentDao.addComment(comment);
        // comment from dao.get
        Comment comment2 = commentDao.getComment(comment.getCommentId());

        //asserting
        assertEquals(comment, comment2);

    }

    @Test
    public void getAllComments() {

        Comment comment = new Comment();
        comment.setPostId(6);
        comment.setCreateDate(LocalDate.of(1990, 9, 11));
        comment.setCommenterName("13 more days");
        comment.setComment("I love Java");

        commentDao.addComment(comment);

        comment = new Comment();
        comment.setPostId(2);
        comment.setCreateDate(LocalDate.of(2015, 9, 21));
        comment.setCommenterName("7 DAYS!");
        comment.setComment("I will come find you");
        commentDao.addComment(comment);

        List<Comment> commentList = commentDao.getAllComments();

        assertEquals(commentList.size(), 2);

    }

    @Test
    public void updateComment() {
        Comment comment = new Comment();
        comment.setPostId(5);
        comment.setCreateDate(LocalDate.of(1990, 9, 11));
        comment.setCommenterName("13 more days");
        comment.setComment("I love Java");

        comment = commentDao.addComment(comment);

        comment.setPostId(5);
        comment.setCreateDate(LocalDate.of(1991, 9, 11));
        comment.setCommenterName("7 more days");
        comment.setComment("I hate Java");

        commentDao.updateComment(comment);

        Comment comment2 = commentDao.getComment(comment.getCommentId());

        assertEquals(comment2, comment);

    }

    @Test
    public void getCommentByPostId() {
        Comment comment = new Comment();
        comment.setPostId(5);
        comment.setCreateDate(LocalDate.of(1990, 9, 11));
        comment.setCommenterName("13 more days");
        comment.setComment("I love Java");

        commentDao.addComment(comment);

        comment = new Comment();
        comment.setPostId(9);
        comment.setCreateDate(LocalDate.of(1999, 9, 11));
        comment.setCommenterName("Java");
        comment.setComment("I hate Java");

        commentDao.addComment(comment);

        comment = new Comment();
        comment.setPostId(9);
        comment.setCreateDate(LocalDate.of(2005, 4, 18));
        comment.setCommenterName("JavaScript");
        comment.setComment("JavaScript is better");

        commentDao.addComment(comment);

        List<Comment> commentList = commentDao.getCommentByPostId(9);
        assertEquals(commentList.size(), 2);

        commentList = commentDao.getCommentByPostId(5);
        assertEquals(commentList.size(), 1);

        commentList = commentDao.getCommentByPostId(1);
        assertEquals(commentList.size(), 0);

    }
}