import java.util.ArrayList;
import java.util.List;

public class InvertString {
    public static String invert(String str) {
        char[] arr = str.toCharArray();
        StringBuilder inverted = new StringBuilder();

        for (int i = arr.length - 1; i >= 0; i--) {
            inverted.append(arr[i]);
        }
        return inverted.toString();
        //return new StringBuilder(str).reverse().toString();
    }
}
