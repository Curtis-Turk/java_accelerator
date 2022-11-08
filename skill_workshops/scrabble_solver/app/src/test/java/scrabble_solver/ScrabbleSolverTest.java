package scrabble_solver;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ScrabbleSolverTest {
    @Test
    public void calculatesA(){
        ScrabbleSolver scrabbleSolver = new ScrabbleSolver('a');
        assertEquals(scrabbleSolver.score(), 1);
    }
}
