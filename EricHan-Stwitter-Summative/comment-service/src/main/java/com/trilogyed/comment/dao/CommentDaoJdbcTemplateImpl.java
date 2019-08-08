package com.trilogyed.comment.dao;

import com.trilogyed.comment.model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class CommentDaoJdbcTemplateImpl implements CommentDao{

    private JdbcTemplate jdbcTemplate;

    // Prepared Statements Strings
    public static final String INSERT_COMMENT_SQL =
            "insert into comment (post_id, create_date, commenter_name, comment) values (?, ?, ?, ?)";
    public static final String SELECT_COMMENT_BY_ID =
            "select * from comment where comment_id = ?";
    public static final String SELECT_ALL_COMMENTS =
            "select * from comment";
    public static final String UPDATE_COMMENT =
            "update comment set post_id = ?, create_date = ?, commenter_name = ?, comment = ? where comment_id = ?";
    public static final String DELETE_COMMENT =
            "delete from comment where comment_id = ?";
    public static final String SELECT_COMMENT_BY_POST_ID =
            "select * from comment where post_id = ?";


    @Autowired
    public CommentDaoJdbcTemplateImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Comment getComment(int id) {
        try {
            return jdbcTemplate.queryForObject(SELECT_COMMENT_BY_ID, this::mapRowToComment, id);
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }

    @Override
    public List<Comment> getAllComments() {
        return jdbcTemplate.query(SELECT_ALL_COMMENTS, this::mapRowToComment);

    }

    @Override
    @Transactional
    public Comment addComment(Comment comment) {
        jdbcTemplate.update(
                INSERT_COMMENT_SQL,
                comment.getPostId(),
                comment.getCreateDate(),
                comment.getCommenterName(),
                comment.getComment());

                int id = jdbcTemplate.queryForObject("select LAST_INSERT_ID()", Integer.class);
                comment.setCommentId(id);
                return comment;
    }

    @Override
    public void updateComment(Comment comment) {
        jdbcTemplate.update(UPDATE_COMMENT,
                comment.getPostId(),
                comment.getCreateDate(),
                comment.getCommenterName(),
                comment.getComment(),
                comment.getCommentId());
    }

    @Override
    public void deleteComment(int id) {
        jdbcTemplate.update(DELETE_COMMENT, id);

    }

    @Override
    public List<Comment> getCommentByPostId(int id) {
        return jdbcTemplate.query(SELECT_COMMENT_BY_POST_ID, this::mapRowToComment, id);
    }

    //Mapper
    @Transactional
    private Comment mapRowToComment(ResultSet rs, int rowNum) throws SQLException {
        Comment comment = new Comment();

        comment.setCommentId(rs.getInt("comment_id"));
        comment.setPostId(rs.getInt("post_id"));
        comment.setCreateDate(rs.getDate("create_date").toLocalDate());
        comment.setCommenterName(rs.getString("commenter_name"));
        comment.setComment(rs.getString("comment"));

        return comment;
    }
}

