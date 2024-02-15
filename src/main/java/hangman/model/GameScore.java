package hangman.model;
public interface GameScore{
    /**
     * @pre It needs two initial values, the correct and the incorrect ones
     * @param correctCount
     * @param incorrectCount
     * @pos Its a value with the calculated score
     * @return Returns the calculated score
     */
    public int calculateScore(int correctCount, int incorrectCount);
}