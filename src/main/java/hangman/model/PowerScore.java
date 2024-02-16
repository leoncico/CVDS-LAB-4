package hangman.model;

import java.math.*;

public class PowerScore implements GameScore{

    @Override
    public int calculateScore(int correctCount, int incorrectCount) {
        int points = 0;
        boolean flag = false;

        int result;

        if (points==0 && flag){ 
            result =  correctCount * (int)Math.pow(5, correctCount);
        }
        else{
            result = (correctCount * (int)Math.pow(5, correctCount)) - (incorrectCount * 8);
        }
        if(result >= 500){
            result = 500;
        }
        return result;
    }
    
}
