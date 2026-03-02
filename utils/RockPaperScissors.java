package utils;

import java.io.Console;
import java.util.concurrent.ThreadLocalRandom;

public class RockPaperScissors {
    private final int rockIndex = 0;
    private final int paperIndex = 1;
    private final int scissorIndex = 2;
    private final Console c = System.console();

    public void playRockPaperScissors() {
        startGame();

        String input = c.readLine();
        int yourIndex;

        switch (input) {
            case "rock":
                yourIndex = rockIndex;
                break;
            case "paper":
                yourIndex = paperIndex;
            default:
                yourIndex = scissorIndex;
                break;
        }

        int pcIndex = getRandomIndex(0, 2);

        calculateWinner(yourIndex, pcIndex);
    }

    public int getRandomIndex(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    public void startGame() {
        System.out.println("Welcome to the game of rock paper sciccors!");
        System.out.println("Type eiher <rock>, <paper> or <scissors>");
    }

    public void calculateWinner(int index1, int index2) {

    }
}
