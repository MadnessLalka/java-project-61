package hexlet.code;

import java.util.Scanner;

public class App {
    private String name;
    private final Scanner sc = new Scanner(System.in);

    public String getName() {
        return name;
    }

    void main() {
        startGame();
    }

    private void startGame() {
        var menuPoint = "";

        var startMenu = """
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                0 - Exit
                """;

        IO.println(startMenu);

        menuPoint = sc.next();

        if (menuPoint.equals("1")) {
            greetInterface();
        } else if (menuPoint.equals("2")) {
            greetInterface();
            evenGame();
        } else {
            System.exit(0);
        }
    }

    private void greetInterface() {
        var startMenu = """
                Welcome to the Brain Games!
                May I have your name?
                """;

        IO.print(startMenu);

        name = sc.next();

        IO.println("Hello, " + getName() + "!");
    }

    private void evenGame() {
        var evenGame = new EvenGame(sc, name);

        evenGame.startGame();
        evenGame.getAnswerToFinishedGame();
    }

}

