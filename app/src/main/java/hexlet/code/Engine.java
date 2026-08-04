package hexlet.code;

import java.util.Random;

public class Engine {
    private final int COUNT_GAME = 3;
    private final Random rand = new Random();
    private final int minRand = -10;
    private final int maxRand = 10;

    private final String trueAnswer;
    private final String falseAnswer;


    public Engine(String trueAnswer, String falseAnswer) {
        this.trueAnswer = trueAnswer;
        this.falseAnswer = falseAnswer;
    }

    public int getCOUNT_GAME() {
        return COUNT_GAME;
    }

    public Random getRand() {
        return rand;
    }

    public int getMinRand() {
        return minRand;
    }

    public int getMaxRand() {
        return maxRand;
    }

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
