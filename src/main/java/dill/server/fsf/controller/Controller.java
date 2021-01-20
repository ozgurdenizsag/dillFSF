package dill.server.fsf.controller;


import dill.server.fsf.facade.Facade;
import dill.server.fsf.modele.GameState;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/api")
public class Controller {
    Facade facade = new Facade();

    @GetMapping("/game/{id}")
    public ResponseEntity<GameState> findById(@PathVariable("id") int id){
        GameState gameState = facade.gameStatesContainsId(id);
        if (gameState != null){
            return ResponseEntity.ok(gameState);
        }
        return ResponseEntity.notFound().build();
    }


    @GetMapping("/games")
    public ResponseEntity<Collection<GameState>>  findAll() {
        final List<GameState> gameStateList = facade.getGameStates();
        return ResponseEntity.ok().body(gameStateList);
    }

}
