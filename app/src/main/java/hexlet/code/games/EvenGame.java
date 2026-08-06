package hexlet.code.games;

import java.util.Random;

public class EvenGame implements Game {
    private Random random;
    private int minRand;
    private int maxRand;
    private int randNumber;

    public void setRandom(Random random) {
        this.random = random;
    }

    public void setMinRand(int minRand) {
        this.minRand = minRand;
    }

    public void setMaxRand(int maxRand) {
        this.maxRand = maxRand;
    }

    @Override
    public String getDescription() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    @Override
    public String getQuestion() {
        randNumber = random.nextInt(
                (maxRand - minRand) + 1);

        return String.valueOf(randNumber);
    }


    public String getAnswer() {
        if (randNumber % 2 == 0) {
            return "yes";
        }
        return "no";
    }

    @Override
    public String getGameCode() {
        return "1";
    }
}
