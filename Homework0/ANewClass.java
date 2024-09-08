package Homework0;

public class ANewClass extends SpaceAlien implements ZapsWithSmile {
  private String aNewField;
  
public ANewClass(String aNewField) {
  this.aNewField = aNewField;
}

  @Override
  public void doGreeting() {
    System.out.println("Hi " + aNewField + "!");
  }

  
}
