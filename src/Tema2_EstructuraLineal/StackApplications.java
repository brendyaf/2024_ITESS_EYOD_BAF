package Tema2_EstructuraLineal;



/**
 *
 * @author Sandra Araceli Hernandez Muñoz
 */
public class StackApplications {

    public static <E> void reverse(E[] a) {
        Stack<E> buffer = new ArrayStack<>(a.length);
        for (int i = 0; i < a.length; i++) {
            buffer.push(a[i]);
        }
        for (int i = 0; i < a.length; i++) {
            a[i] = buffer.pop();
        }

    }

    public static boolean isMatched(String expression) {
        final String opening = "({["; // opening delimiters
        final String closing = ")}]"; // respective closing delimiters
        Stack <Character> buffer = new LinkedStack<>();
        for (char c : expression.toCharArray()) {// for iterador del rpimer al ultimo caracter
            if (opening.indexOf(c) != -1) // el indexof busca el caracer para ver si esta, si no esta te regresa -1
            {
                buffer.push(c);
            } else if (closing.indexOf(c) != -1) { // this is a right delimiter
                if (buffer.isEmpty()) // nothing to match with
                {
                    return false;
                }
                if (closing.indexOf(c) != opening.indexOf(buffer.pop())) {
                    return false; // mismatched delimiter
                }
            }
        }
        return buffer.isEmpty();
    }
    
    public static boolean isHTMLMatched(String html) {
        Stack<String> buffer = new LinkedStack<>( );
        int j = html.indexOf('<'); // find first ’<’ character (if any)
        while (j != -1) {
        int k = html.indexOf('>', j+1); // find next ’>’ character
        if (k == -1)
        return false; // invalid tag
         String tag = html.substring(j+1, k); // strip away < >
        if (!tag.startsWith("/")) // this is an opening tag
        buffer.push(tag);
        else { // this is a closing tag
        if (buffer.isEmpty( ))
        return false; // no tag to match
        if (!tag.substring(1).equals(buffer.pop( ))) // substring es de un pedazo de un string dependiendi del indice
        return false; // mismatched tag
        }
        j = html.indexOf('<', k+1); // find next ’<’ character (if any)
        }
         return buffer.isEmpty( ); // were all opening tags matched?
       }
}