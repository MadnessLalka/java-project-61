package hexlet.code.games;

import java.util.Random;

public class EvenGame implements Game {
    private Random random;
    private int minRand;
    private int maxRand;

    public void setRandom(Random random) {
        this.random = random;
    }

    public void setMinRand(int minRand) {
        this.minRand = minRand;
    }

    public void setMaxRand(int maxRand) {
        this.maxRand = maxRand;
    }

    public EvenGame() {
    }

    @Override
    public String getDescription() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    @Override
    public String getQuestion() {
        var randNumber = random.nextInt(
                (maxRand - minRand) + 1);

        return String.valueOf(randNumber);
    }

    @Override
    public String getAnswer() {
        if (Integer.parseInt(getQuestion()) % 2 == 0) {
            return "yes";
        } else if (Integer.parseInt(getQuestion()) % 2 != 0) {
            return "no";
        }
        return "";
    }

    @Override
    public String getGameCode() {
        return "1";
    }
}
