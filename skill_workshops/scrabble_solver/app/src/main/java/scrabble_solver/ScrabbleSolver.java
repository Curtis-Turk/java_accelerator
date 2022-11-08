package scrabble_solver;

public class ScrabbleSolver {
    String word;
    ScrabbleSolver(String inputWord){
        word = inputWord;
    }
    public Integer score(){
       if(word == " ") return 0;
       return word.length();
    }
}
