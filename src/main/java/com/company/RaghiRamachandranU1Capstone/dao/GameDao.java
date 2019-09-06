package com.company.RaghiRamachandranU1Capstone.dao;

import com.company.RaghiRamachandranU1Capstone.model.Game;

import java.util.List;

public interface GameDao {
    Game addGame(Game game);

    Game getGame(int gameId);

    List<Game> getAllGames();

    Game updateGame(Game game);

    void deleteGame(int gameId);

    List<Game> findGamesByStudio(String studio);

    List<Game> findGamesByERSBRating(String ersbRating);

    List<Game> findGamesByTitle(String title);

}

