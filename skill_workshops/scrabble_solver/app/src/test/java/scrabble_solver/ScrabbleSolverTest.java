package scrabble_solver;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ScrabbleSolverTest {
    @Test
    public void calculatesA(){
        ScrabbleSolver scrabbleSolver = new ScrabbleSolver("A");
        assertEquals(scrabbleSolver.score(), 1);
    }
    @Test
    public void is0whenGivenString(){
        ScrabbleSolver scrabbleSolver = new ScrabbleSolver(" ");
        assertEquals(scrabbleSolver.score(), 0);
    }
    @Test
    public void is2whenGivenTwoAs(){
        ScrabbleSolver scrabbleSolver = new ScrabbleSolver("AA");
        assertEquals(scrabbleSolver.score(), 2);
    }
    @Test
    public void is3whenGivenThreeAs(){
        ScrabbleSolver scrabbleSolver = new ScrabbleSolver("AAA");
        assertEquals(scrabbleSolver.score(), 3);
    }
    @Test
    public void is10whenGivenZ(){
        ScrabbleSolver scrabbleSolver = new ScrabbleSolver("Z");
        assertEquals(scrabbleSolver.score(), 10);
    }
    @Test
    public void is20whenGivenZz(){
        ScrabbleSolver scrabbleSolver = new ScrabbleSolver("ZZ");
        assertEquals(scrabbleSolver.score(), 20);
    }
    @Test
    public void is11whenGivenZA(){
        ScrabbleSolver scrabbleSolver = new ScrabbleSolver("ZA");
        assertEquals(scrabbleSolver.score(), 11);
    }
    @Test
    public void is6WhenGivenWord(){
        ScrabbleSolver scrabbleSolver = new ScrabbleSolver("STREET");
        assertEquals(scrabbleSolver.score(), 6);
    }
    @Test
    public void is14WhenGivenCabbage(){
        ScrabbleSolver scrabbleSolver = new ScrabbleSolver("CABBAGE");
        assertEquals(scrabbleSolver.score(), 14);
    }
    @Test
    public void is14WhenGivenOXYPHENBUTAZONE(){
        ScrabbleSolver scrabbleSolver = new ScrabbleSolver("OXYPHENBUTAZONE");
        assertEquals(scrabbleSolver.score(), 41);
    }
    @Test
    public void is14WhenGivenQUIRKY(){
        ScrabbleSolver scrabbleSolver = new ScrabbleSolver("QUIRKY");
        assertEquals(scrabbleSolver.score(), 22);
    }
    @Test
    public void is14WhenGivenLowerCase(){
        ScrabbleSolver scrabbleSolver = new ScrabbleSolver("quirky");
        assertEquals(scrabbleSolver.score(), 22);
    }
}

