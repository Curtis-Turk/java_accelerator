package scrabble_solver;

import java.util.*;

public class ScrabbleSolver {
    String word;
    Map<Character, Integer> letterScore;

    ScrabbleSolver(String inputWord){
        word = inputWord.toUpperCase(Locale.ROOT);
        setLetterScores();
    }
    public Integer score(){
        int total = 0;
        if(word.equals(" ")) return total;

        for(char c : word.toCharArray()) {
           total += letterScore.get(c);
        }
        return total;
    }
    public void setLetterScores(){
        letterScore = new HashMap<>();
        String onePoint = "AEIOULNRST";
        for (int i = 0; i < onePoint.length(); i++) {
            letterScore.put(onePoint.charAt(i), 1);
        }

        letterScore.put('D', 2);
        letterScore.put('G', 2);

        String threePoints = "BCMP";
        for (int i = 0; i < threePoints.length(); i++) {
            letterScore.put(threePoints.charAt(i), 3);
        }

        String fourPoints = "FHVWY";
        for (int i = 0; i < fourPoints.length(); i++) {
            letterScore.put(fourPoints.charAt(i), 4);
        }
        letterScore.put('K', 5);
        letterScore.put('J', 8);
        letterScore.put('X', 8);
        letterScore.put('Q', 10);
        letterScore.put('Z', 10);
    }
}
