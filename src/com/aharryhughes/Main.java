package com.aharryhughes;

public class Main {

    public static void main(String[] args) {
	// write your code here
        GamePiece gamepiece = new GamePiece();

        gamepiece.unfreeze();
        System.out.println(gamepiece.isFrozen());
        gamepiece.move(1,1);
        System.out.println(gamepiece.getPositionX());
        System.out.println(gamepiece.getPositionY());

        gamepiece.move(2,2);
        System.out.println(gamepiece.getPositionX());
        System.out.println(gamepiece.getPositionY());

        gamepiece.freeze();
        System.out.println(gamepiece.isFrozen());
        gamepiece.move(1,1);
        System.out.println(gamepiece.getPositionX());
        System.out.println(gamepiece.getPositionY());

    }
}
