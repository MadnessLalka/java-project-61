package hexlet.code.games;

import java.util.Random;

public interface Game {
    String getDescription();
    String getGameCode();
    String getAnswer();
    String getQuestion();

    void setRandom(Random random);
    void setMinRand(int minRand);
    void setMaxRand(int maxRand);
}
