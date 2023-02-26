import java.util.Arrays;
import java.util.Comparator;

public class Outline {
  public static void main(String... args) { // varargs alternative to String[]

    // Create String array
    String[] arr = {
      "goodbye",
      "hello",
      "good morning",
      "good afternoon"
    };

    // Sort the array by length (i.e., shortest to longest)
    Arrays.sort(arr, (a, b) -> Integer.compare( a.length(), b.length() ));
    System.out.println( "Question 1.1: " + Arrays.toString(arr) );
  } 
}
