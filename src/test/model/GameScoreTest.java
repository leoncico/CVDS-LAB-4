import hangman.model.*;
import org.junit.test;

import com.google.common.annotations.VisibleForTesting;

import org.junit.Assert;

/*
 * Las tres clases de equivalencia inicialmente serán
 * una por cada nuevo tipo de puntaje
 * 
 */
public class GameScoreTest {
    private GameScore original = new OriginalScore();
    private gameScore bonus = new BonusScore();
    private gameScore power = new PowerScore();    

    /**
     * Original 
     * Casos frontera 0 = correctCount y 0 < correctCount < 10
     * El puntaje final siempre será multiplo de 10
     */

    @Test 
    public void validateOriginalZeroScore(){
        int res = original.calculateScore(3, 10);
        Assert.equals(0, res);
    }

    @Test
    public void validateOrginalPerfectScore(){
        int res = original.calculateScore(3, 0);
        Assert.equals(100, res);
    }
    /**
     * Bonus 
     * Casos frontera 0 < incorrectCount < (longitud de la palabra) * 10 y 0 < correctCount < (longitud de la palabra) * 10
     * El puntaje final siempre será multiplo de 5
     */
    @Test 
    public void validateBonusZeroScore(){
        int res = bonus.calculateScore(0, 0);
        Assert.equals(0, res);
    }

    @Test
    public void validateBonusPositiveScore(){
        int res = bonus.calculateScore(4, 2);
        Assert.equals(20, res);
    }
    
    /**
     * Power 
     * Casos frontera 0 < incorrectCount < 8 * (longitud de la palabra) y 0 < correctCount < 5 ^ (longitud de la palabra)
     */

     @Test 
     public void validatePowerZeroScore(){
         int res = power.calculateScore(0, 0);
         Assert.equals(1, res);
     }
 
     @Test
     public void validatePowerPositiveScore(){
         int res = power.calculateScore(10, 2);
         Assert.equals(484, res);
     }

     @Test
     public void validatePowerFullScore(){
         int res = power.calculateScore(4, 0);
         Assert.equals(500, res);
     }
}
