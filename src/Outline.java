import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;

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

  public static void question1_3() {
    /*
     * Question:
     * 
     * Sort by first character
     * 
     */
    String[] arr = getArray();
    Arrays.sort(
        arr,
        (a, b) -> Character.compare(a.charAt(0), b.charAt(0)));
    System.out.println("Question 1.3: " + Arrays.toString(arr));
  }

  public static void question1_4() {
    /*
     * Question:
     * 
     * Sort by Strings that contain "e" first, everything else second.
     * 
     */
    String[] arr = getArray();
    Arrays.sort(
        arr,
        (a, b) -> {
          if (!a.contains("e") && b.contains("e")) {
            return 1;
          } else if (a.contains("e") && !b.contains("e")) {
            return -1;
          } else {
            return 0;
          }
        });
    System.out.println("Question 1.4: " + Arrays.toString(arr));
  }

  public static void question2() {
    /*
     * Question:
     * 
     * Sort by Strings that contain "e" first, everything else second.
     * 
     */
    String[] arr = getArray();
    Arrays.sort(arr, StringUtils::eChecker);
    System.out.println("Question 2: " + Arrays.toString(arr));
  }

  public static void main(String... args) { // varargs alternative to String[]
    System.out.println("Input: " + Arrays.toString(getArray()));
    question1_1();
    question1_2();
    question1_3();
    question1_4();
    question2();
  }
}
