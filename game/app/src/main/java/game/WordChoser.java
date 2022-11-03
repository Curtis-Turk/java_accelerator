package game;

import java.util.Random;

public class WordChoser {

  public static final String[] DICTIONARY = { "MAKERS", "CANDIES", "DEVELOPER", "LONDON" };

  public String getRandomWordFromDictionary() {
    Random rdm = new Random();

    int randIndex = rdm.nextInt(DICTIONARY.length);
    return DICTIONARY[randIndex];
  }
}
