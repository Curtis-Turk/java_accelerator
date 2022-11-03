package game;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WordChoserTest {
  @Test
  public void inialisesWithDictionary() {
    WordChoser wordChoser = new WordChoser();
    assertEquals("Starts with the Dictionary", wordChoser.DICTIONARY, { "MAKERS", "CANDIES", "DEVELOPER", "LONDON" });
  }
}
