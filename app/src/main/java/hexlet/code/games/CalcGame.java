package hexlet.code.games;

import hexlet.code.UnknownObjectException;

import java.util.Random;

public class CalcGame implements Game {
    private Random random;
    private int minRand;
    private int maxRand;
    private int operationRandNumber;
    private int a;
    private int b;

    @Override
    public String getDescription() {
        return "What is the result of the expression?";
    }

    @Override
    public String getGameCode() {
        return "2";
    }

    @Override
    public String getQuestion() {
        var operationCount = 3;

        a = random.nextInt((maxRand - minRand) + 1);
        b = random.nextInt((maxRand - minRand) + 1);

        operationRandNumber = random.nextInt(operationCount);
        return a + " " + getArithmeticOperation(operationRandNumber) + " " + b;
    }

    @Override
    public String getAnswer() {
        switch (getArithmeticOperation(operationRandNumber)) {
            case "+" -> {
                return String.valueOf(a + b);
            }
            case "-" -> {
                return String.valueOf(a - b);
            }
            case "*" -> {
                return String.valueOf(a * b);
            }
            default -> throw new UnknownObjectException("Unknown Arithmetic Operation!");

        }
    }

    @Override
    public void setRandom(Random random) {
        this.random = random;
    }

    @Override
    public void setMinRand(int minRand) {
        this.minRand = minRand;
    }

    @Override
    public void setMaxRand(int maxRand) {
        this.maxRand = maxRand;
    }

    private String getArithmeticOperation(int randArithmeticNumb) {
        switch (randArithmeticNumb) {
            case 0 -> {
                return "+";
            }
            case 1 -> {
                return "-";
            }
            case 2 -> {
                return "*";
            }
            default -> throw new UnknownObjectException("Unknown Arithmetic Operation!");

        }
    }
}
