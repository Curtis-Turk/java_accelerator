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
    @Test public void returnsBLetter(){
        MiddleLetter ml = new MiddleLetter();
        assertEquals(ml.middle("ABC"),"B");
    }
    @Test public void returnsBCLetter(){
        MiddleLetter ml = new MiddleLetter();
        assertEquals(ml.middle("ABCD"),"BC");
    }
    @Test public void returnsTest(){
        MiddleLetter ml = new MiddleLetter();
        assertEquals(ml.middle("test"),"es");
    }
    @Test public void returnsMiddle(){
        MiddleLetter ml = new MiddleLetter();
        assertEquals(ml.middle("middle"),"dd");
    }
}
