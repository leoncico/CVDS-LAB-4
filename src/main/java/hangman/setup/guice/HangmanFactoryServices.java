/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman.setup.guice;

import hangman.model.OriginalScore;
import hangman.model.*;
import hangman.model.dictionary.*;
import hangman.view.*;
import hangman.setup.*;


/**
 * @author 2106913
 */

public class HangmanFactoryServices extends com.google.inject.AbstractModule {

    @Override
    protected void configure() {
        /* Guice dependency injection */
        // bind(Interface.class).to(Concrete.class);

        bind(GameScore.class).to(BonusScore.class);
        bind(Language.class).to(French.class);
        bind(HangmanDictionary.class).to(FrenchDictionaryDataSource.class);
        bind(HangmanPanel.class).to(HangmanStickmanPanel.class);
    }

}
