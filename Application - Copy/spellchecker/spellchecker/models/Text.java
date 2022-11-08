package spellchecker.models;

import spellchecker.interfaces.ICheckable;
import spellchecker.interfaces.IDatabase;

import java.util.ArrayList;
import java.util.Arrays;

public class Text extends CheckableText{
  int numberOfWords;
  ArrayList<String> parts;

  // constructor
  public Text(String text) {
    // this.text = text;

    super(text);

    // split the text into individual words to be tested
    this.parts = new ArrayList<String>(Arrays.asList(this.getText().split(" ")));
    this.numberOfWords = parts.size();
  }

  public boolean check(IDatabase database) {
    System.out.println(this.getText());

    // current word to check
    Word word;

    // iterate over all words to check
    for(int i=0; i<this.numberOfWords; i++) {
      word = new Word(this.parts.get(i));
      if(!word.check(database)) {
        return false;
      }
    }

    return true;
  }

  //put inside abstract
  // public int length() {
  //   return this.text.length();
  // }

}
