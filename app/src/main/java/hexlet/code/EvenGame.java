package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class EvenGame implements Game {
    private final Scanner sc;
    private final String name;
    private boolean isPlayerWin = false;
    private static final int COUNT_GAME = 3;
    private final Random rand = new Random();

    public EvenGame(Scanner sc, String name) {
        this.sc = sc;
        this.name = name;
    }

    @Override
    public void startGame() {
        var minRand = -10;
        var maxRand = 10;

        IO.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (var i = 0; i < COUNT_GAME; i++) {
            var randNumber = rand.nextInt((maxRand - minRand) + 1);

            IO.println("Question: " + randNumber);
            IO.print("Your answer: ");

            var answer = sc.next();

            IO.println(answer);

            if (randNumber % 2 == 0 && answer.equals("yes") || randNumber % 2 != 0 && answer.equals("no")) {
                isPlayerWin = true;
                IO.println("Correct!");
            } else {
                isPlayerWin = false;
                System.out.printf("'yes' is wrong answer ;(. Correct answer was 'no'.\n" + "Let's try again, %s!"
                        , name
                );
            }

            IO.println();

        }
    }

    @Override
    public void getAnswerToFinishedGame() {
        if (isPlayerWin) {
            IO.println("Congratulations, " + name + "!");
        }
    }
}
