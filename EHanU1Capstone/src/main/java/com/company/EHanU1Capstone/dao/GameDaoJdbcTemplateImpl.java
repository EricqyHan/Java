package com.company.EHanU1Capstone.dao;

import com.company.EHanU1Capstone.model.Console;
import com.company.EHanU1Capstone.model.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class GameDaoJdbcTemplateImpl implements GameDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private static final String INSERT_GAME_SQL =
            "insert into game (title, esrb_rating, description, price, studio, quantity) values (?, ?, ?, ?, ?, ?)";

    private static final String SELECT_GAME_SQL =
            "select * from game where game_id = ?";

    private static final String SELECT_ALL_GAMES_SQL =
            "select * from game";

    private static final String UPDATE_GAME_SQL =
            "update game set title = ?, esrb_rating = ?, description = ?, price = ?, studio = ?, quantity = ? where game_id = ?";

    private static final String DELETE_GAME_SQL =
            "delete from game where game_id = ?";

    private static final String SELECT_GAME_BY_STUDIO_SQL =
            "select * from game where studio = ?";

    private static final String SELECT_GAME_BY_ESRBRATING_SQL =
            "select * from game where studio = ?";

    private static final String SELECT_GAME_BY_Title_SQL =
            "select * from game where studio = ?";

    @Autowired
    public GameDaoJdbcTemplateImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Game addGame(Game game) {
        jdbcTemplate.update(
                INSERT_GAME_SQL,
                game.getTitle(),
                game.getEsrbRating(),
                game.getDescription(),
                game.getPrice(),
                game.getStudio(),
                game.getQuantity());

        int id = jdbcTemplate.queryForObject("SELECT LAST_INSERT_ID()", Integer.class);

        game.setGameID(id);
        return game;
    }

    @Override
    public Game getGame(int gameID) {
        try {
            return jdbcTemplate.queryForObject(SELECT_GAME_SQL, this::mapRowToGame, gameID);
        } catch (EmptyResultDataAccessException e) {
            // if there is no match for this album id, return null
            return null;
        }    }

    @Override
    public List<Game> getAllGames() {
        return jdbcTemplate.query(SELECT_ALL_GAMES_SQL, this::mapRowToGame);
    }

    @Override
    public Game updateGame(Game game) {
        jdbcTemplate.update(
                UPDATE_GAME_SQL,
                game.getTitle(),
                game.getEsrbRating(),
                game.getDescription(),
                game.getPrice(),
                game.getStudio(),
                game.getQuantity(),
                game.getGameID());

        return game;
    }

    @Override
    public List<Game> getGameByStudio(String string) {
        return jdbcTemplate.query(SELECT_GAME_BY_STUDIO_SQL, this::mapRowToGame, string);
    }

    @Override
    public List<Game> getGameByESRBRating(String string) {
        return jdbcTemplate.query(SELECT_GAME_BY_ESRBRATING_SQL, this::mapRowToGame, string);
    }

    @Override
    public List<Game> getGameByTitle(String string) {
        return jdbcTemplate.query(SELECT_GAME_BY_Title_SQL, this::mapRowToGame, string);
    }

    @Override
    public void deleteGame(int gameID) {
        jdbcTemplate.update(DELETE_GAME_SQL, gameID);
    }


    private Game mapRowToGame(ResultSet rs, int rowNum) throws SQLException {
        Game game = new Game();
        game.setGameID(rs.getInt("game_id"));
        game.setTitle(rs.getString("title"));
        game.setEsrbRating(rs.getString("esrb_rating"));
        game.setDescription(rs.getString("description"));
        game.setPrice(rs.getBigDecimal("price"));
        game.setStudio(rs.getString("studio"));
        game.setQuantity(rs.getInt("quantity"));

        return game;
    }
}
