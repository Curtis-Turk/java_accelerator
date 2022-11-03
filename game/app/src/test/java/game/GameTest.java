package game;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GameTest {
  @Test
  public void testGetsWordToGuess() {
    Game game = new Game();
    assertEquals(game.getWordToGuess("BOOKS"), "B____");
  }

  @Test
  public void makersWordToGuess() {
    String word = "MAKERS";
    Game game = new Game();
    assertEquals(game.getWordToGuess(word), "M_____");
  }

  @Test
  public void getAttempts() {
    Game game = new Game();
    assertEquals(game.getRemainingAttempts(), 10);
  }

  // @Test
  // public void testRandomWord() {
  // Game game = new Game();
  // assertEquals(game.getRandomWordFromDictionary(), "MAKERS");
  // }
}