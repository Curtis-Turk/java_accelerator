package scrabble_solver;

import java.util.*;

public class ScrabbleSolver {
    String word;
    Map<Character, Integer> letterScore;

    ScrabbleSolver(String inputWord){
        word = inputWord;
        setLetterScore();
    }
    public Integer score(){
        int total = 0;
        if(word.equals(" ")) return total;

        for(char c : word.toCharArray()) {
           total += letterScore.get(c);
        }
        return total;
    }
    public void setLetterScore(){
        letterScore = new HashMap<>();
        letterScore.put('A', 1);
        letterScore.put('Z', 10);
        letterScore.put('S', 1);
        letterScore.put('T', 1);
        letterScore.put('R', 1);
        letterScore.put('E', 1);
    }
}
