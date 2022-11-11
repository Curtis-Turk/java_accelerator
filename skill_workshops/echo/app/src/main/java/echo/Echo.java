package echo;

import java.io.*;

public class Echo {
    private BufferedReader input;
    private PrintStream output;

    public Echo(InputStream input, PrintStream output){
        this.input = new BufferedReader(new InputStreamReader(input));
        this.output = output;
    }
    public void run() throws IOException {
        output.println("Say something:");
        String echo = input.readLine();
        output.println(echo);
    };
}
