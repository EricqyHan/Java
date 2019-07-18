package com.company.EHanU1Capstone.dao;

import com.company.EHanU1Capstone.model.Game;

import java.util.List;

public interface GameDao {

    Game addGame(Game game);

    Game getGame(int gameID);

    List<Game> getAllGames();

    Game updateGame(Game game);

    void deleteGame(int gameID);

    List<Game> getGameByStudio(String string);

    List<Game> getGameByESRBRating(String string);

    List<Game> getGameByTitle(String string);


}
