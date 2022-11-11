package echo;

import org.junit.Test;

import java.io.*;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class echoTest {

    @Test
    public void printsSaySomethingToConsole() throws IOException {
        String[] echoOutput = runApp("");
        assertEquals("Say something:", echoOutput[0]);
    }

    @Test
    public void saySomething() throws IOException {
        String[] echoOutput = runApp("Hello world");
        assertEquals("Hello world", echoOutput[1]);
    }

    private String[] runApp(String userInput) throws IOException {
        // instead of System.in (what a user types into the console)
        InputStream input = new ByteArrayInputStream(userInput.getBytes());

        // instead of System.out (what the console returns)
        ArrayList<Character> captured = new ArrayList<>();
        OutputStream output = new OutputStream() {
            @Override
            public void write(int inByteValue) throws IOException {
                captured.add((char) inByteValue);
            }
        };

        Echo echo = new Echo(input, new PrintStream(output));
        echo.run();

        // modify captured to something that is testable
        String appOutput = captured.stream()
                .map(Object::toString)
                .reduce("", (acc, e) -> acc  + e);
        return appOutput.split("\\r?\\n");
    }
}
