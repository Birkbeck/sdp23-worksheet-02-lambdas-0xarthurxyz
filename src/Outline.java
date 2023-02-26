import java.util.Arrays;
import java.util.Comparator;

public class Outline {

  // Helper method
  public static String[] getArray() {
    // Create String array
    return new String[] {
        "goodbye",
        "hello",
        "good morning",
        "good afternoon"
    };
  }

  public static void question1_1() {
    /*
     * Question:
     *
     * Sort the array by length (i.e., shortest to longest)
     * 
     */
    String[] arr = getArray();
    Arrays.sort(
        arr,
        (a, b) -> Integer.compare(a.length(), b.length()));
    System.out.println("Question 1.1: " + Arrays.toString(arr));
  }

  public static void question1_2() {
    /*
     * Question:
     * 
     * Sort the array by reverse length (i.e., longest to shortest)
     * 
     */
    String[] arr = getArray();
    Arrays.sort(
        arr,
        (a, b) -> Integer.compare(-a.length(), -b.length()));
    System.out.println("Question 1.2: " + Arrays.toString(arr));
  }

  public static void main(String... args) { // varargs alternative to String[]
    System.out.println("Input: " + Arrays.toString(getArray()));
    question1_1();
    question1_2();
  }
}
