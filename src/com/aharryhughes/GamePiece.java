package com.aharryhughes;

/**
 * Created by ahhughes8 on 7/31/17.
 */
public class GamePiece {
    private int positionX;
    private int positionY;
    private boolean frozen;
    private String color;
    private String name;

    public GamePiece() {
    }

    public void move(int x, int y){
        if(!frozen) {
            positionX = x;
            positionY = y;
        }
        else{
            System.out.println("this piece is frozen");
        }
    }

    public void freeze(){
        frozen = true;
    }

    public void unfreeze(){
        frozen = false;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public boolean isFrozen() {
        return frozen;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
