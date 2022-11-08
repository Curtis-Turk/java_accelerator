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
    public void returns0whenGivenString(){
        ScrabbleSolver scrabbleSolver = new ScrabbleSolver(" ");
        assertEquals(scrabbleSolver.score(), 0);
    }
    @Test
    public void returns2whenGivenTwoAs(){
        ScrabbleSolver scrabbleSolver = new ScrabbleSolver("AA");
        assertEquals(scrabbleSolver.score(), 2);
    }
    @Test
    public void returns3whenGivenThreeAs(){
        ScrabbleSolver scrabbleSolver = new ScrabbleSolver("AAA");
        assertEquals(scrabbleSolver.score(), 3);
    }
    @Test
    public void returns10whenGivenZ(){
        ScrabbleSolver scrabbleSolver = new ScrabbleSolver("Z");
        assertEquals(scrabbleSolver.score(), 10);
    }
    @Test
    public void returns20whenGivenZz(){
        ScrabbleSolver scrabbleSolver = new ScrabbleSolver("ZZ");
        assertEquals(scrabbleSolver.score(), 20);
    }
    @Test
    public void returns11whenGivenZA(){
        ScrabbleSolver scrabbleSolver = new ScrabbleSolver("ZA");
        assertEquals(scrabbleSolver.score(), 11);
    }
}

