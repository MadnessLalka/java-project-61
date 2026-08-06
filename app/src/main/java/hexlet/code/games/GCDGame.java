package hexlet.code.games;

import java.util.Random;

public class GCDGame implements Game{
    private Random random;
    private int minRand;
    private int maxRand;

    @Override
    public String getDescription() {
        return "Find the greatest common divisor of given numbers.";
    }

    @Override
    public String getGameCode() {
        return "3";
    }

    @Override
    public String getAnswer() {
        return "";
    }

    @Override
    public String getQuestion() {
        return "";
    }

    @Override
    public void setRandom(Random random) {

    }

    @Override
    public void setMinRand(int minRand) {

    }

    @Override
    public void setMaxRand(int maxRand) {

    }
}
