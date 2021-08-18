import java.util.ArrayList;
import java.util.List;

public class Week4BetaLab1 {

    public static void main(String[] args) {
        // Instantiate a new StringBuilder and append the characters 0 through 9 to it separated
        // by dashes. Make sure no dash appears at the end of the StringBuilder.
        StringBuilder numbers = new StringBuilder();
        // for (int i = 0; i <= 9; i++) {
        //     numbers.append(i + "-");
        // }
        // numbers.toString();
        // numbers.deleteCharAt(numbers.length() - 1);
        // System.out.println(numbers);

        // This was my solution. It could be cleaner. The solution presented was as follows:

        for (int i = 0; i < 10; i++) {
            numbers.append(i);
            if (i != 9) {
                numbers.append("-");
            }
        }
        System.out.println(numbers.toString());
        // Create a list of Strings and add 5 Strings to it, each with a different length.
        List<String> words = new ArrayList<String>(); // Try removing = new ArrayList<String>()
        // and replacing it with Arrays.asList("Four", "Score", etc. etc.) and then removing the
        // words.add lines below.
        words.add("Four");
        words.add("Score");
        words.add("Battle");
        words.add("Lincoln");
        words.add("Colonial");
        // Write and test a method that takes a list of strings and returns the shortest string.
        System.out.println(shortestString(words));
        // Write and test a method that takes a list of strings and returns the list with the first
        // and last element switched.
        System.out.println(firstLastSwapped(words));
        // Write and test a method that takes a list of strings and returns a string with all the
        // list elements concatenated to each other, separated by a comma.
        System.out.println(addCommas(words));
    }
    // Write and test a method that takes a list of strings and returns the shortest string.
    public static String shortestString(List<String> testWords) {
        String shortest = testWords.get(0);
        for (String word : testWords) {
            if (word.length() < shortest.length()) {
                shortest = word;
            }
        }
        return shortest;
    }
    // Write and test a method that takes a list of strings and returns the list with the first
    // and last element switched.
    public static List<String> firstLastSwapped(List<String> testWords) {
        // String placeHolder = testWords.get(0);
        // testWords.set(0, testWords.get(testWords.size() - 1));
        // testWords.set(testWords.size() - 1, placeHolder);
        // return testWords;
        StringBuilder placeHolder = new StringBuilder(testWords.get(0));
        testWords.set(0, testWords.get(testWords.size() - 1));
        testWords.set(testWords.size() - 1, placeHolder.toString());
        return testWords;
    }
    // Write and test a method that takes a list of strings and returns a string with all the list
    // elements concatenated to each other, separated by a comma.
    public static String addCommas(List<String> testWords) {
        StringBuilder listAsString = new StringBuilder();
        for (String word : testWords) {
            listAsString.append(word + ",");
        }
        return listAsString.toString();
    }
}