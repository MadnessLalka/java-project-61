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
        var greetPoint = "1";
        var evenGamePoint = "2";
        var calcGamePoint = "3";
        var gCDGamePoint = "4";
        var progressiveGame = "5";
        var primeGame = "6";

        var menuPoint = "";

        var startMenu = """
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progressive
                6 - Prime
                0 - Exit
                """;

        IO.println(startMenu);

        menuPoint = sc.next();

        if (menuPoint.equals(greetPoint)) {
            greetInterface();
        } else if (menuPoint.equals(evenGamePoint) || menuPoint.equals(calcGamePoint) ||
                menuPoint.equals(gCDGamePoint) || menuPoint.equals(progressiveGame) ||
                menuPoint.equals(primeGame)) {
            greetInterface();
            star(menuPoint);
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

    private void star(String menuPoint) {
        var engine = new Engine(sc, name, menuPoint);

        engine.startGame();
    }
}

