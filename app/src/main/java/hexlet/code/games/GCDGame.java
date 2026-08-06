package hexlet.code.games;

import java.util.Random;

public class GCDGame implements Game {
    private Random random;
    private int minRand;
    private int maxRand;
    private int a;
    private int b;

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
        var aBSa = Math.abs(a);
        var aBSb = Math.abs(b);

        while (aBSb != 0) {
            var temp = aBSb;
            aBSb = aBSa % aBSb;
            aBSa = temp;
        }

        return String.valueOf(aBSa);
    }

    @Override
    public String getQuestion() {
        a = random.nextInt((maxRand - minRand) + 1);
        b = random.nextInt((maxRand - minRand) + 1);

        return a + " " + b;
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
