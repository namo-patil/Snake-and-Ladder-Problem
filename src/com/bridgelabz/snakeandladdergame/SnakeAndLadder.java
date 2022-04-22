package com.bridgelabz.snakeandladdergame;

import java.util.Random;

public class SnakeAndLadder {
    public static final int START_POSITION = 0;
    public static final int NO_PLAY = 0;
    public static final int LADDER = 1;
    public static final int SNAKE = 2;
    static String POSITION;
    static Random random = new Random();

    public static int dieRoll() {
        int diceValue = random.nextInt(6) + 1;
        System.out.println("Dice value : " + diceValue);
        return diceValue;
    }

    public static int playerChecksOption() {
        int currentPosition = START_POSITION;
        int checkOption = random.nextInt(3);
        int diceNumber = dieRoll();
        switch (checkOption) {
            case NO_PLAY:
                currentPosition = currentPosition;
                POSITION = "Not played";
                break;
            case LADDER:
                currentPosition += diceNumber;
                POSITION = "Player is on Ladder";
                break;
            case SNAKE:
                currentPosition -= diceNumber;
                POSITION = "Player is on Snake";
                break;
        }
        System.out.println("Player's Position :" + POSITION + ",  #Current Position :" + currentPosition);
        return currentPosition;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder Game");
        playerChecksOption();
    }
}
