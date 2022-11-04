package game;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.*;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GameTest {

  @BeforeEach
  public void setup() {

  }

  @Test
  public void getAttempts() {
    WordChoser mockedWC = mock(WordChoser.class);
    Game game = new Game(mockedWC);
    assertEquals(game.getRemainingAttempts(), 10);
  }

  @Test
  public void testGetsWordToGuess() {
    WordChoser mockedWC = mock(WordChoser.class);
    when(mockedWC.getRandomWordFromDictionary()).thenReturn("BOOKS");
    Game game = new Game(mockedWC);
    assertEquals(game.getWordToGuess(), "B____");
  }

  @Test
  public void makersWordToGuess() {
    WordChoser mockedWC = mock(WordChoser.class);
    when(mockedWC.getRandomWordFromDictionary()).thenReturn("MAKERS");
    Game game = new Game(mockedWC);
    assertEquals(game.getWordToGuess(), "M_____");
  }

  @Test
  public void testGuessLetterTrue() {
    WordChoser mockedWC = mock(WordChoser.class);
    when(mockedWC.getRandomWordFromDictionary()).thenReturn("MAKERS");
    Game game = new Game(mockedWC);
    assertEquals(game.guessLetter('A'), true);
  }

  @Test
  public void testGuessLetterFalse() {
    WordChoser mockedWC = mock(WordChoser.class);
    when(mockedWC.getRandomWordFromDictionary()).thenReturn("MAKERS");
    Game game = new Game(mockedWC);
    assertEquals(game.guessLetter('X'), false);
  }

  @Test
  public void checkFailedAttempt() {
    WordChoser mockedWC = mock(WordChoser.class);
    when(mockedWC.getRandomWordFromDictionary()).thenReturn("MAKERS");
    Game game = new Game(mockedWC);
    game.guessLetter('X');
    assertEquals(game.getRemainingAttempts(), 9);
  }
}