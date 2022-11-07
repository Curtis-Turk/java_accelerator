package game;

import java.util.ArrayList;

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
    Masker mockedM = mock(Masker.class);
    Game game = new Game(mockedWC, mockedM);
    assertEquals(game.getRemainingAttempts(), 10);
  }

  @Test
  public void testGuessLetterTrue() {
    WordChoser mockedWC = mock(WordChoser.class);
    Masker mockedM = mock(Masker.class);
    when(mockedWC.getRandomWordFromDictionary()).thenReturn("MAKERS");
    Game game = new Game(mockedWC, mockedM);
    assertEquals(game.guessLetter('A'), true);
  }

  @Test
  public void testGuessLetterFalse() {
    WordChoser mockedWC = mock(WordChoser.class);
    Masker mockedM = mock(Masker.class);
    when(mockedWC.getRandomWordFromDictionary()).thenReturn("MAKERS");
    Game game = new Game(mockedWC, mockedM);
    assertEquals(game.guessLetter('X'), false);
  }

  @Test
  public void checkFailedAttempt() {
    WordChoser mockedWC = mock(WordChoser.class);
    Masker mockedM = mock(Masker.class);
    when(mockedWC.getRandomWordFromDictionary()).thenReturn("MAKERS");
    Game game = new Game(mockedWC, mockedM);
    game.guessLetter('X');
    assertEquals(game.getRemainingAttempts(), 9);
  }

  @Test
  public void checkWord() {
    WordChoser mockedWC = mock(WordChoser.class);
    Masker mockedM = mock(Masker.class);
    when(mockedWC.getRandomWordFromDictionary()).thenReturn("MAKERS");
    ArrayList<Character> guessedLetters = new ArrayList<Character>();
    when(mockedM.getMaskedWord("MAKERS", guessedLetters)).thenReturn("M_____");
    Game game = new Game(mockedWC, mockedM);
    assertEquals(game.getWordToGuess(), "M_____");
  }

  // @Test
  // public void checkWordWithGuess() {
  // WordChoser mockedWC = mock(WordChoser.class);
  // Masker mockedM = mock(Masker.class);
  // when(mockedWC.getRandomWordFromDictionary()).thenReturn("MAKERS");
  // ArrayList<Character> guessedLetters = new ArrayList<Character>();
  // guessedLetters.add('A');
  // System.out.println(guessedLetters);
  // when(mockedM.getMaskedWord("MAKERS", guessedLetters)).thenReturn("MA____");
  // Game game = new Game(mockedWC, mockedM);
  // assertEquals(game.getWordToGuess(), "MA____");
  // }
}