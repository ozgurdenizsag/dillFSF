package dill.server.fsf.facade;

import dill.server.fsf.modele.GameState;

import java.util.ArrayList;

public class Facade {
    private static ArrayList<GameState> gameStates = new ArrayList<>();

    static {
        gameStates.add(new GameState("Morpion","Start"));
        gameStates.add(new GameState("Lucky Luck","Pause"));
        gameStates.add(new GameState("Sniper","End"));
    }

    public ArrayList<GameState> getGameStates() {
        return gameStates;
    }

    public void setGameStates(ArrayList<GameState> gameStates) {
        this.gameStates = gameStates;
    }

    public GameState gameStatesContainsId(int id){
        for (GameState gameState : gameStates ) {
            if(gameState.getId() == id) {
                return gameState;
            }
        }
        return null;
    }
}
