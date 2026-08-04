package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class EvenGame implements Game {
    private final Scanner sc;
    private final String name;
    private boolean isPlayerWin = false;

    public EvenGame(Scanner sc, String name) {
        this.sc = sc;
        this.name = name;
    }

    @Override
    public void startGame() {
        var evenEngine = new Engine();

        IO.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (var i = 0; i < evenEngine.getCOUNT_GAME(); i++) {
            var randNumber = evenEngine.getRand().nextInt(
                    (evenEngine.getMaxRand() - evenEngine.getMinRand()) + 1);

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
