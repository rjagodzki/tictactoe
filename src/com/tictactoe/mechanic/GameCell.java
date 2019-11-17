package com.tictactoe.mechanic;

public class GameCell {
    public enum Cell{
        X,
        O;
    }

    int col;
    int row;
    boolean enabled;

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isEnabled() {
        return enabled;
    }
}







//    public int getCos() {
//        return cos;
//    }
//    int cos = 0;//1 - krzyzyk, 2-kolko
//
//
//
//    public void setCos(int cos) {//na enuma
//        this.cos = cos;
//    }
