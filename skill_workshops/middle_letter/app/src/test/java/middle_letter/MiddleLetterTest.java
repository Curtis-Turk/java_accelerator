package middle_letter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MiddleLetterTest {
    @Test public void returnsALetter(){
        MiddleLetter ml = new MiddleLetter();
        assertEquals(ml.middle("A"),"A");
    }
    @Test public void returnsABLetters(){
        MiddleLetter ml = new MiddleLetter();
        assertEquals(ml.middle("AB"),"AB");
    }
}
