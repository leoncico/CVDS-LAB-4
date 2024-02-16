package hangman.model;

public class OriginalScore implements GameScore{

    public OriginalScore(){ 
    }

    @Override
    public int calculateScore(int correctCount, int incorrectCount) {
        int points = 100;
        return points - incorrectCount*10;
    }
    
}
