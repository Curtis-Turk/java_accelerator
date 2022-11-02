package game;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GameTest {
  @Test
  public void testGetsWordToGuess() {
    String word = "BOOKS";
    Game game = new Game(word);
    assertEquals(game.getWordToGuess(word), "B____");
  }

  @Test
  public void makersWordToGuess() {
    String word = "MAKERS";
    Game game = new Game(word);
    assertEquals(game.getWordToGuess(word), "M_____");
  }
}