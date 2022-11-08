package spellchecker.models;

public abstract class CheckableText {
  // public String text;
  private String text;
  
  public String getText() {
      return text;
  }
  
  public CheckableText(String text){
    this.text = text;
  }

  public abstract boolean check(Database database);

  // public abstract int length();

  public int length() {
    return this.text.length();
  }
}
