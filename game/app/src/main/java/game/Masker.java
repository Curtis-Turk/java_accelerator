package game;

import java.util.ArrayList;

public class Masker {

  public String getMaskedWord(String word, ArrayList guessedLetters) {
    StringBuilder sb = new StringBuilder(word);

    for (int i = 1; i < word.length(); i++) {
      if (!guessedLetters.contains(word.charAt(i))) {
        sb.replace(i, i + 1, "_");
      }
    }
    return sb.toString();
  }
}
