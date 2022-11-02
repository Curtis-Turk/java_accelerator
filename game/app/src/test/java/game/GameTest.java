package game;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GameTest {
  @Test
  public void testGetsWordToGuess() {
    String word = "B_____";
    Game game = new Game(word);
    assertEquals(game.getWordToGuess(word), "B_____");
  }

  @Test
  public void makersWordToGuess() {
    String word = "MAKERS";
    Game game = new Game(word);
    assertEquals(game.getWordToGuess(word), "MAKERS");
  }
}