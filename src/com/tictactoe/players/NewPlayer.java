package com.tictactoe.players;

public class NewPlayer extends DataBase {
    private final String playerName;
    private final int won;
    private final int lost;

    public NewPlayer(String playerName, int won, int lost) {
        this.playerName = playerName;
        this.won = won;
        this.lost = lost;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getWon() {
        return won;
    }

    public int getLost() {
        return lost;
    }

    @Override
    public String toString() {
        return  playerName + "; " + won + "; " + lost;
    }
}
