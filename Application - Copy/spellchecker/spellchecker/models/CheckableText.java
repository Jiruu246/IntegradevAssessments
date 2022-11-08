package spellchecker.models;

import spellchecker.interfaces.ICheckable;

public abstract class CheckableText implements ICheckable {
  // public String text;
  private String text;
  
  public String getText() {
      return text;
  }
  
  public CheckableText(String text){
    this.text = text;
  }

  // public abstract int length();

  public int length() {
    return this.text.length();
  }
}
