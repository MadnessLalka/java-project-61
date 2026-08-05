package hexlet.code;

import hexlet.code.games.CalcGame;
import hexlet.code.games.EvenGame;
import hexlet.code.games.Game;

import java.util.Random;
import java.util.Scanner;

public class Engine {
    private final int COUNT_GAME = 3;
    private final Random rand = new Random();
    private final int MIN_RAND = -10;
    private final int MAX_RAND = 10;

    private final Scanner sc;
    private final String name;
    private final String gameID;

    public Engine(Scanner sc, String name, String gameID) {
        this.sc = sc;
        this.name = name;
        this.gameID = gameID;
    }

    public void startGame() {
        var gameObject = getChoisenGame(gameID);
        var correctAnswerCount = 0;

        IO.println(gameObject.getDescription());

        for (var i = 0; i < COUNT_GAME; i++) {
            IO.println("Question: " + gameObject.getQuestion());
            IO.print("Your answer: ");

            String answer = sc.next();

            IO.println();
            IO.println(gameObject.getAnswer());

            if (answer.contains(gameObject.getAnswer())) {
                correctAnswerCount++;
                IO.println("Correct!");
            } else {
                IO.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + gameObject.getAnswer() + "'.");
            }
        }

        if (correctAnswerCount == COUNT_GAME) {
            IO.println("Congratulations, " + name);
        }

    }

    private Game getChoisenGame(String gameId) {
        var gameObject = switch (gameId) {
            case "2" -> new EvenGame();
            case "3" -> new CalcGame();
            default -> throw new UnknownGameException("Unknown Game!");
        };

        gameObject.setRandom(rand);
        gameObject.setMaxRand(MAX_RAND);
        gameObject.setMinRand(MIN_RAND);

        return gameObject;
    }


}
