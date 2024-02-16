package hangman.model;

public class BonusScore implements GameScore{

    @Override
    public int calculateScore(int correctCount, int incorrectCount) {
        int score = 0;
        if(correctCount>0){
            score += correctCount * 10;
        }
        if(incorrectCount > 0){
            score -= incorrectCount * 5;
        }
        if(score < 0){
            score = 0;
        }
        return score;
    }
    
}
