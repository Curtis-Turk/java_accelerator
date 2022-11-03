package game;

import static org.junit.Assert.*;

import org.junit.Test;
import java.util.Arrays;;

public class WordChoserTest {
  @Test
  public void testGetRandomWord() {
    WordChoser wordChoser = new WordChoser();
    String[] MOCK_DICTIONARY = { "MAKERS", "CANDIES", "DEVELOPER", "LONDON" };
    assertTrue(Arrays.asList(MOCK_DICTIONARY).contains(wordChoser.getRandomWordFromDictionary()));
  }
}
