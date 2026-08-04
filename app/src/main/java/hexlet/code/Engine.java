package hexlet.code;

import hexlet.code.games.CalcGame;
import hexlet.code.games.EvenGame;
import hexlet.code.games.Game;

import java.util.Random;
import java.util.Scanner;

public class Engine {
    private final int COUNT_GAME = 3;
    private final Random rand = new Random();
    private final int minRand = -10;
    private final int maxRand = 10;

    private final String trueAnswer;
    private final String falseAnswer;


    public Engine(Scanner sc, String trueAnswer, String falseAnswer) {
        this.trueAnswer = trueAnswer;
        this.falseAnswer = falseAnswer;
    }

    public void startGame() {



//        IO.println("Answer 'yes' if the number is even, otherwise answer 'no'.");



        for (var i = 0; i < evenEngine.getCOUNT_GAME(); i++) {
            var randNumber = evenEngine.getRand().nextInt(
                    (evenEngine.getMaxRand() - evenEngine.getMinRand()) + 1);

            IO.println("Question: " + randNumber);
            IO.print("Your answer: ");

            var answer = sc.next();

            IO.println(answer);

//            if (randNumber % 2 == 0 && answer.equals("yes") || randNumber % 2 != 0 && answer.equals("no")) {
//                isPlayerWin = true;
//                IO.println("Correct!");
//            } else {
//                isPlayerWin = false;
//                System.out.printf("'yes' is wrong answer ;(. Correct answer was 'no'.\n" + "Let's try again, %s!"
//                        , name
//                );
//            }

            IO.println();

        }
    }

    public void getAnswerToFinishedGame() {
        if (isPlayerWin) {
            IO.println("Congratulations, " + name + "!");
        }
    }

    private Game getChoisenGame(String gameId) throws UnknownGameException {
       var gameObject = switch (gameId){
            case "1" -> new EvenGame();
            case "2" -> new CalcGame();
           default -> throw new UnknownGameException("Unknown game");
        };

       gameObject.setRandom(rand);
       gameObject.setMaxRand(maxRand);
       gameObject.setMaxRand(minRand);

       return gameObject;
    }


}
