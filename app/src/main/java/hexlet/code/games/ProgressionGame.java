package hexlet.code.games;

import java.util.Random;

public class ProgressionGame implements Game {
    private Random random;
    private int minRand;
    private int maxRand;
    private int[] a;
    private int randIndex;

    @Override
    public String getDescription() {
        return "What number is missing in the progression?";
    }

    @Override
    public String getGameCode() {
        return "5";
    }

    @Override
    public String getAnswer() {
        return String.valueOf(a[randIndex]);
    }

    @Override
    public String getQuestion() {
        var countNumberProgression = 10;
        var minNumberProgression = 5;
        var randomCountProgression = random.nextInt(countNumberProgression) + minNumberProgression;
        var randStep = random.nextInt(4) + 1;
        var randomNumberStart = random.nextInt(maxRand - minRand) + 1;
        a = new int[randomCountProgression];

        randIndex = getRandomIndexFromArray(a.length);

        StringBuilder progression = new StringBuilder();

        for (var i = 0; i < randomCountProgression; i++) {
            var randNumber = randomNumberStart + i * randStep;

            if (i == randIndex) {
                progression.append(" ").append("..");
            } else {
                progression.append(" ").append(randNumber);
            }

            a[i] = randNumber;
        }

        return progression.toString();

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

    private int getRandomIndexFromArray(int length) {
        return random.nextInt(length - 1);
    }
}
