package hangman.setup.factoryMethod;

import com.google.inject.Guice;
import com.google.inject.Injector;

import hangman.model.*;
import hangman.model.dictionary.*;
import hangman.setup.*;
import hangman.setup.guice.HangmanFactoryServices;
import hangman.view.HangmanPanel;
import hangman.view.HangmanStickmanPanel;

public class HangmanDefaultFactoryMethod extends HangmanFactoryMethod {
    

    @Override
    public HangmanDictionary createDictionary() {
        //return new EnglishDictionaryDataSource();
        Injector injector = Guice.createInjector(new HangmanFactoryServices());
        return injector.getInstance(HangmanDictionary.class);
    }

    @Override
    public Language createLanguage() {
        //return new English();
        Injector injector = Guice.createInjector(new HangmanFactoryServices());
        return injector.getInstance(Language.class);
    }

    @Override
    public HangmanPanel createHangmanPanel() {
        //return new HangmanStickmanPanel();
        Injector injector = Guice.createInjector(new HangmanFactoryServices());
        return injector.getInstance(HangmanStickmanPanel.class);
    }

    
    
    @Override
    public GameScore createGameScore() {
       //return new OriginalScore();
       Injector injector = Guice.createInjector(new HangmanFactoryServices());
       return injector.getInstance(GameScore.class);
    }

}
