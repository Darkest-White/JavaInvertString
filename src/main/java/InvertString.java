import java.util.ArrayList;
import java.util.List;

public class InvertString {
    public static String invert(String str) {
        StringBuilder inverted = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            inverted.append(str.charAt(i));
        }
        return inverted.toString();
        //return new StringBuilder(str).reverse().toString();
    }
}
