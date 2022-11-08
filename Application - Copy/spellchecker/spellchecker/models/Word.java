package spellchecker.models;

import spellchecker.interfaces.ICheckable;
import spellchecker.interfaces.IDatabase;

public class Word extends CheckableText{

  
  // constructor
  public Word(String text) {
    // this.text = text;

    super(text);

  }

  // check the word
  public boolean check(IDatabase database) {
    if(database.checkWord(this.getText())) {
      return true;
    }
    return false;
  }

  // return the length

}
