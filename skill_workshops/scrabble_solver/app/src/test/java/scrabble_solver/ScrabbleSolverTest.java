package scrabble_solver;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ScrabbleSolverTest {
    @Test
    public void calculatesA(){
        ScrabbleSolver scrabbleSolver = new ScrabbleSolver("a");
        assertEquals(scrabbleSolver.score(), 1);
    }
    @Test
    public void returns0whenGivenString(){
        ScrabbleSolver scrabbleSolver = new ScrabbleSolver(" ");
        assertEquals(scrabbleSolver.score(), 0);
    }
    @Test
    public void returns2whenGivenTwoAs(){
        ScrabbleSolver scrabbleSolver = new ScrabbleSolver("aa");
        assertEquals(scrabbleSolver.score(), 2);
    }
    @Test
    public void returns3whenGivenThreeAs(){
        ScrabbleSolver scrabbleSolver = new ScrabbleSolver("aaa");
        assertEquals(scrabbleSolver.score(), 3);
    }
}
