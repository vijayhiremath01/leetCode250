import java.util.* ;

public class code1 {
    public static void main(String[] args) {
      // String comparison
      String a = "vijay";
      String b = "vijay";

      System.out.println(a == b);  // It gives true

      String name1 = new String("vijay");
      String name2 = new String("vijay");

      System.out.println(name1 == name2);   //  It gives false
        System.out.print(name1.equals(name2));
    }
}