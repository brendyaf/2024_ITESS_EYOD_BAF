
package Tema2_EstructuraLineal;

import static Tema2_EstructuraLineal.StackApplications.isHTMLMatched;
import static Tema2_EstructuraLineal.StackApplications.isMatched;
import java.util.Arrays;
import static Tema2_EstructuraLineal.StackApplications.reverse;

/**
 *
 * @author Admi
 */
public class StackApplicationsTest {
  public static void main(String args[ ]) {
    Integer[ ] a = {4, 8, 15, 16, 23, 42}; // autoboxing allows this
    String[ ] s = {"Jack", "Kate", "Hurley", "Jin", "Michael"};
    System.out.println("a = " + Arrays.toString(a));
    System.out.println("s = " + Arrays.toString(s));
    System.out.println("Reversing...");
    reverse(a);
    reverse(s);
    System.out.println("a = " + Arrays.toString(a));
    System.out.println("s = " + Arrays.toString(s));
    
    System.out.println("");
    
    String L = "<body>\n" +
    "<center>\n" +
    "<h1> The Little Boat </h1>\n" +
    "</center>\n" +
    "<p> The storm tossed the little\n" +
    "boat like a cheap sneaker in an\n" +
    "old washing machine. The three\n" +
    "drunken fishermen were used to\n" +
    "such treatment, of course, but\n" +
    "not the tree salesman, who even as\n" +
    "a stowaway now felt that he\n" +
    "had overpaid for the voyage. </p>\n" +
    "<ol>\n" +
    "<li> Will the salesman die? </li>\n" +
    "<li> What color is the boat? </li>\n" +
    "<li> And what about Naomi? </li>\n" +
    "</ol>\n" +
    "</body>";
    System.out.println(L);
    System.out.println("Tu codigo es: " + isHTMLMatched(L));
    
    String A = "{ [ ( ) ( ) ] }";
      System.out.println(A);
      System.out.println("Tu codigo es: "+ isMatched(A));


 }  
  
  
  
}
