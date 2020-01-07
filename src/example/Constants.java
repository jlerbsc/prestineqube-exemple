package example;
/**
 * Constants
 *
 */
public final class Constants {

  public static final String SOMETHING_HERE = new String("something");

  public String retour1() {
    return new String("test2");
  }

  private String retour2() {
    boolean var1 = true;
    boolean var2 = true;
    if (var1) {
      if(var2) {
        return "test2";
      }
    }
    return "test2";
  }
  
  public boolean checkIfToto(String s) {
    return s.equals("test");
  }

  public String convert(int myInteger) {
      return new Integer(myInteger).toString(); 
  }
}