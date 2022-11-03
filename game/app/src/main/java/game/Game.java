package game;

import java.util.Random;

public class Game {

  String inputWord;
  int attemptCounter = 10;

  public static final String[] DICTIONARY = { "MAKERS", "CANDIES", "DEVELOPER", "LONDON" };

  Game() {
    inputWord = getRandomWordFromDictionary();
  }

  public int getRemainingAttempts() {
    return attemptCounter;
  }

  public String getWordToGuess(String word) {

    StringBuilder sb = new StringBuilder(word);

    for (int i = 1; i < word.length(); i++) {
      sb.replace(i, word.length(), "_");
    }

    return sb.toString();
  }

  public String getRandomWordFromDictionary() {
    Random rdm = new Random();

    int randIndex = rdm.nextInt(DICTIONARY.length);
    return DICTIONARY[randIndex];
  }
}
