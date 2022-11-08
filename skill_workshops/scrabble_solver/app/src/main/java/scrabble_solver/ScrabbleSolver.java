package scrabble_solver;

import java.util.*;

public class ScrabbleSolver {
    String word;
    Map<Character, Integer> letterScore;

    ScrabbleSolver(String inputWord){
        word = inputWord.toUpperCase(Locale.ROOT);
        populateHashMap();
    }
    public Integer score(){
        int total = 0;
        if(word.equals(" ")) return total;

        for(char c : word.toCharArray()) {
           total += letterScore.get(c);
        }
        return total;
    }
    public void populateHashMap(){
        letterScore = new HashMap<>();
        setLetterScores("AEIOULNRST", 1);
        setLetterScores("DG", 2);
        setLetterScores("BCMP", 3);
        setLetterScores("FHVWY", 4);
        setLetterScores("K", 5);
        setLetterScores("JX", 8);
        setLetterScores("QZ", 10);
    }
    public void setLetterScores (String letters, int score){
        for (int i = 0; i < letters.length(); i++) {
            letterScore.put(letters.charAt(i), score);
        }
    }
}
