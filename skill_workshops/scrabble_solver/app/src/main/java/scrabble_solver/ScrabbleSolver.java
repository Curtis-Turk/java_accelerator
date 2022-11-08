package scrabble_solver;

import java.util.*;

public class ScrabbleSolver {
    String word;
    Map<Character, Integer> letterScore;

    ScrabbleSolver(String inputWord){
        word = inputWord;
        letterScore = new HashMap<>();
        letterScore.put('A', 1);
        letterScore.put('Z', 10);
    }
    public Integer score(){
        int total = 0;
        if(word.equals(" ")) return total;

        for(char c : word.toCharArray()) {
           total += letterScore.get(c);
        }
        return total;
    }
}
