package spellchecker;

import spellchecker.interfaces.ICheckable;
import spellchecker.models.*;

public class TextFactory {
    
    public ICheckable createText(String currentText){

        if(currentText.contains(" ")) {
            // contains a space
            return new Text(currentText);
        } else {
            // no spaces, treat as a word
            return new Word(currentText);
        }
    }
}
