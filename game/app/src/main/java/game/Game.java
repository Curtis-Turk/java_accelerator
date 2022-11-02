package game;

public class Game {
  String inputWord;
  String hiddenWord;

  Game(String word) {
    inputWord = word;
  }

  public String hideWord() {

    return inputWord;
  }

  public String getWordToGuess(String word) {

    StringBuilder sb = new StringBuilder(word);

    for (int i = 1; i < word.length(); i++) {
      sb.replace(i, word.length(), "_");
    }

    return sb.toString();
  }
}
