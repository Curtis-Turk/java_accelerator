package game;

import java.util.ArrayList;

public class Game {
  String word;
  int attemptCounter = 10;
  ArrayList<Character> guessedLetters = new ArrayList<Character>();

  Game(WordChoser wChoser) {
    word = wChoser.getRandomWordFromDictionary();
  }

  public int getRemainingAttempts() {
    return attemptCounter;
  }

  public String getWordToGuess() {
    StringBuilder sb = new StringBuilder(word);

    for (int i = 1; i < word.length(); i++) {
      sb.replace(i, word.length(), "_");
    }
    return sb.toString();
  }

  public Boolean guessLetter(char letter) {
    if (word.indexOf(letter) > 0) {
      guessedLetters.add(letter);
      return true;
    }
    attemptCounter--;
    return false;
  }

}
