package com.company.EHanU1Capstone.controller;


import com.company.EHanU1Capstone.service.ServiceLayer;
import com.company.EHanU1Capstone.viewmodel.GameViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/game")
public class GameController {
    @Autowired
    ServiceLayer serviceLayer;

    @GetMapping//Another way to set the Rest API Get mapping
    @ResponseStatus(HttpStatus.OK)
    public List<GameViewModel> getAllGames() {
        return serviceLayer.findAllGames();
    }

    @PostMapping//Another way to set the Rest API Post mapping
    @ResponseStatus(HttpStatus.CREATED)
    public GameViewModel createGames(@RequestBody @Valid GameViewModel games) {
        return serviceLayer.saveGame(games);
    }

    @GetMapping("/{id}")//Another way to set the Rest API Get mapping
    @ResponseStatus(HttpStatus.OK)
    public GameViewModel getGames(@PathVariable("id") int gameId) {
        GameViewModel gamesViewModel = serviceLayer.findGamesbyId(gameId);
        if (gamesViewModel == null)
            throw new IllegalArgumentException("Game could not be retrieved for id " + gameId);
        return gamesViewModel;
    }

    @DeleteMapping("/{id}")//Another way to set the Rest API Delete mapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteGames(@PathVariable("id") int gameId) {
        serviceLayer.removeGame(gameId);
    }

    @PutMapping("/{id}")//Another way to set the Rest API Put mapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateGames(@PathVariable("id") int gameId, @RequestBody @Valid GameViewModel gamesViewModel) {
        if (gamesViewModel.getGameID() == 0)
            gamesViewModel.setGameID(gameId);
        if (gameId != gamesViewModel.getGameID()) {
            throw new IllegalArgumentException("Customer ID on path must match the ID in the Customer object");
        }
        serviceLayer.updateGame(gamesViewModel);
    }

    @GetMapping("/studio/{studio}")
    @ResponseStatus(HttpStatus.OK)
    public List<GameViewModel> getGameByStudio(@PathVariable("studio") String studio) {
        List<GameViewModel> games = serviceLayer.findGamesByStudio(studio);
        if (games != null && games.size() == 0)
            throw new IllegalArgumentException("Game could not be retrieved for the customer " + studio);
        return games;
    }

    @GetMapping("/esrb/{esrb}")
    @ResponseStatus(HttpStatus.OK)
    public List<GameViewModel> getGameByEsrb(@PathVariable("ersb") String ersb) {
        List<GameViewModel> games = serviceLayer.findGamesByErsb(ersb);
        if (games != null && games.size() == 0)
            throw new IllegalArgumentException("Game could not be retrieved for the customer " + ersb);
        return games;
    }

    @GetMapping("/title/{title}")
    @ResponseStatus(HttpStatus.OK)
    public List<GameViewModel> getGameByTitle(@PathVariable("title") String title) {
        List<GameViewModel> games = serviceLayer.findGamesByTitle(title);
        if (games != null && games.size() == 0)
            throw new IllegalArgumentException("Game could not be retrieved for the customer " + title);
        return games;
    }
}
