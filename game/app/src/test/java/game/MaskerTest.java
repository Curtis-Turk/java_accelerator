package game;

import java.util.ArrayList;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MaskerTest {
  @Test
  public void testGetsMaskedWord() {
    Masker masker = new Masker();
    ArrayList<Character> guessedLetters = new ArrayList<Character>();
    guessedLetters.add('E');
    guessedLetters.add('V');

    assertEquals(masker.getMaskedWord("DEVELOPER", guessedLetters), "DEVE___E_");
  }

  @Test
  public void testOtherLetters() {
    Masker masker = new Masker();
    ArrayList<Character> guessedLetters = new ArrayList<Character>();
    guessedLetters.add('S');
    guessedLetters.add('P');

    assertEquals(masker.getMaskedWord("DEVELOPER", guessedLetters), "D_____P__");
  }

  @Test
  public void testOtherWord() {
    Masker masker = new Masker();
    ArrayList<Character> guessedLetters = new ArrayList<Character>();
    guessedLetters.add('S');
    guessedLetters.add('P');

    assertEquals(masker.getMaskedWord("SPARES", guessedLetters), "SP___S");
  }
}
