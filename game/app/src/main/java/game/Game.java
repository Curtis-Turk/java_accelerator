package game;

public class Game {
  String inputWord;

  Game(String word) {
    inputWord = word;
  }

  String hideWord() {
    return inputWord;
  }

  public String getWordToGuess(String word) {
    return word;
  }
}
