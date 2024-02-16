package hangman.model;

import java.math.*;

public class PowerScore implements GameScore{

    @Override
    public int calculateScore(int correctCount, int incorrectCount) {
        int score = 0;
        if(correctCount>0){
            for(int i = 1; i <= correctCount; i++){
                score += Math.pow(5, i);
            }
        }
        if(incorrectCount > 0){
            score -= incorrectCount * 8;
        }
        if(score > 500){
            score = 500;
        }
        if(score < 0){
            score = 0;
        }
        return score;
    }
}
