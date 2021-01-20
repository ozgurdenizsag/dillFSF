package dill.server.fsf.modele;

import java.util.concurrent.atomic.AtomicInteger;

public class GameState {
    private static final AtomicInteger count = new AtomicInteger(0);
    private int id;
    private String name;
    private String state; // Start / Pause / End //

    public GameState(String name, String state) {
        this.id = count.incrementAndGet();
        this.name = name;
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
