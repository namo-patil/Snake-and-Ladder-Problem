package com.bridgelabz.snakeandladdergame;

import java.util.Random;

public class SnakeAndLadder {
    public static void playerStartPosition() {
        int startPosition = 0;
    }

    public static int dieRoll() {
        Random random = new Random();
        int diceValue = random.nextInt(6) + 1;
        System.out.println(diceValue);
        return diceValue;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder Game");
        playerStartPosition();
        dieRoll();
    }
}
