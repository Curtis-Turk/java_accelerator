package game;

import java.util.ArrayList;

public class Game {
  String word;
  Masker masker;
  String maskedString;
  int attemptCounter = 10;
  ArrayList<Character> guessedLetters = new ArrayList<Character>();

  Game(WordChoser wChoser, Masker mask) {
    masker = mask;
    word = wChoser.getRandomWordFromDictionary();
  }

  public int getRemainingAttempts() {
    return attemptCounter;
  }

  public String getWordToGuess() {
    return masker.getMaskedWord(word, guessedLetters);
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
