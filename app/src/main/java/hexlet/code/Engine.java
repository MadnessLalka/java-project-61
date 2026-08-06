package hexlet.code;

import hexlet.code.games.*;

import java.util.Random;
import java.util.Scanner;

public class Engine {
    private final int countGame = 3;
    private final Random rand = new Random();
    private final int minRand = -10;
    private final int maxRand = 10;

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

        for (var i = 0; i < countGame; i++) {
            var questNumb = gameObject.getQuestion();

            IO.println("Question: " + questNumb);
            IO.print("Your answer: ");

            String answer = sc.next();

            var answerToQuestion = gameObject.getAnswer();

            IO.println();

            if (answer.trim().equals(answerToQuestion)) {
                correctAnswerCount++;
                IO.println("Correct!");
            } else {
                IO.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + answerToQuestion + "'.");
            }
        }

        if (correctAnswerCount == countGame) {
            IO.println("Congratulations, " + name);
        }

    }

    private Game getChoisenGame(String gameId) {
        var gameObject = switch (gameId) {
            case "2" -> new EvenGame();
            case "3" -> new CalcGame();
            case "4" -> new GCDGame();
            case "5" -> new ProgressionGame();
            default -> throw new UnknownObjectException("Unknown Game!");
        };

        gameObject.setRandom(rand);
        gameObject.setMaxRand(maxRand);
        gameObject.setMinRand(minRand);

        return gameObject;
    }


}
