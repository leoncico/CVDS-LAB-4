package hangman.model;

public class BonusScore implements GameScore{

    @Override
    public int calculateScore(int correctCount, int incorrectCount) {
        int points = 0;
        boolean flag = false;
        int result;

        if (points==0 &&flag ){
            result =  correctCount * 10;
        }
        else{
            result = (correctCount * 10) - (incorrectCount * 5);
            flag = true;
        }

        return result;
    }
    
}
