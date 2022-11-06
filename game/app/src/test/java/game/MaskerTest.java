package game;

import java.util.ArrayList;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.*;

import static org.mockito.Mockito.*;

public class MaskerTest {
  @Test
  public void testGetsMaskedWord() {
    Masker masker = new Masker();
    ArrayList<Character> guessedLetters = new ArrayList<Character>();
    guessedLetters.add('E');
    guessedLetters.add('V');

    assertEquals(masker.getMaskedWord("DEVELOPER", guessedLetters), "DEVE___E_");
  }
}
