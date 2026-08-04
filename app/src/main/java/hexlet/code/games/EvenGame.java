package hexlet.code.games;

import java.util.Random;

public class EvenGame implements Game {
    private final Random random;
    private final int minRand;
    private final int maxRand;

    public EvenGame(Random random, int minRand, int maxRand) {
        this.random = random;
        this.minRand = minRand;
        this.maxRand = maxRand;
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
        }

        return "no";
    }

    @Override
    public String getGameCode() {
        return "1";
    }
}
