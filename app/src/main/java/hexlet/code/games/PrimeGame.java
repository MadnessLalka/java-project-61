package hexlet.code.games;

import java.util.Random;

public class PrimeGame implements Game {
    private Random random;
    private int minRand;
    private int maxRand;
    private int randNumber;

    @Override
    public String getDescription() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    @Override
    public String getGameCode() {
        return "6";
    }

    @Override
    public String getAnswer() {
        if (randNumber < 2) {
            return "no";
        } else if (randNumber == 2) {
            return "yes";
        } else if (randNumber % 2 == 0) {
            return "no";
        } else {
            for (var i = 3; i <= Math.sqrt(randNumber); i++) {
                if (i % 2 != 0 && randNumber % i == 0) {
                    return "no";
                }
            }
        }
        return "yes";
    }

    @Override
    public String getQuestion() {
        randNumber = random.nextInt(
                (maxRand - minRand) + 1);

        return String.valueOf(randNumber);
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
}
