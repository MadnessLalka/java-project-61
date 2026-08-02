package hexlet.code;

import java.util.Scanner;

public class App {
    void main(String[] args) {
        startGame();
    }

    public void startGame() {
        welcomeWindow();
    }

    private void welcomeWindow() {
        Scanner sc = new Scanner(System.in);

        var startMenu = """
                Please enter the game number and press Enter.
                1 - Greet
                0 - Exit
                """;

        IO.println(startMenu);

        if (sc.next().equals("1")) {
            menu(sc);
        } else {
            System.exit(0);
        }
    }

    private void menu(Scanner sc) {
        var name = "";

        var startMenu = """
                Welcome to the Brain Games!
                May I have your name?
                """;

        IO.print(startMenu);

        name = sc.next();

        IO.println("Hello, " + name + "!");
    }
}
