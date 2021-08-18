import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Week4BetaLab3 {
    
    public static void main(String[] args) {
        //Write and test a method that takes a set of Integers and returns a new set of Integers containing
        // only even numbers from the original set.
        Set<Integer> lotsOfNumbers = new HashSet<Integer>();
        lotsOfNumbers = Set.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15, 17, 20);
        Set<Integer> evenSetReturned = evenSet(lotsOfNumbers);
        System.out.println("Even numbers from set:");
        for (int num : evenSetReturned) {
            System.out.println(num);
        }
        // Create a map of String and String and add 3 items to it where the key of each is a word and the
        // value is the definition of the word.
        Map<String, String> wordThenDefinition = new HashMap<String, String>();
        wordThenDefinition.put("Define", "state or describe exactly the nature, scope, or meaning of");
        wordThenDefinition.put("Some", "an unspecified amount or number of");
        wordThenDefinition.put("Things", "an object that one need not, cannot, or does not wish to give a specific name to");
        // Write and test a method that takes a Map<String, String> and a String and returns the value for
        // a key in the map that matches the String parameter (i.e. like a language dictionary lookup).
        String wordBeingSearched = "Things";
        String wordDefined = definition(wordThenDefinition, wordBeingSearched);
        System.out.println("Search word: " + wordBeingSearched);
        System.out.println("Definition: " + wordDefined);
        // Write and test a method that takes a List<String> and returns a Map<Character, Integer> containing
        // a count of all the Strings that start with a given character.
        List<String> fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Pineapple");
        fruits.add("Melon");
        // The line following these comments is based off of a wrong assumption. See method below for full 
        // description. Following that line, the right answer is posted.
        // System.out.println("Fruits found to start with " + startsWithFoundXTimes(fruits));
        Map<Character, Integer> lettersFoundCount = startsWithFoundXTimes(fruits);
        for (Character firstLetter : lettersFoundCount.keySet()) {
            System.out.println(firstLetter + " found " + lettersFoundCount.get(firstLetter) + " time(s).");
        }
    }
    // Write and test a method that takes a set of Integers and returns a new set of Integers containing
    // only even numbers from the original set.
    public static Set<Integer> evenSet(Set<Integer> numbers) {
        Set<Integer> evenNumbers = new HashSet<Integer>();
        for (Integer num : numbers) {
            if (num % 2 == 0) {
                evenNumbers.add(num);
            }
        }
        return evenNumbers;
    }
    // Write and test a method that takes a Map<String, String> and a String and returns the value for
    // a key in the map that matches the String parameter (i.e. like a language dictionary lookup).
    public static String definition(Map<String, String> wordsWithDefinitions, String searchWord) {
        for (String word : wordsWithDefinitions.keySet()) {
            if (word.equals(searchWord)) {
                return wordsWithDefinitions.get(word);
            }
        }
        return "--No word found that matches input, definition unavailable.--";
    }
    // Write and test a method that takes a List<String> and returns a Map<Character, Integer> containing
    // a count of all the Strings that start with a given character.
    public static Map<Character, Integer> startsWithFoundXTimes(List<String> words) {
        // For the code below, I thought it was wanting to test for a particular character. All of
        // this code was under that assumption. After this code, here is what the instructor did to
        // solve this problem.
        // char firstLetter = 'M';
        // int count = 0;
        // Map<Character, Integer> fruitFound = new HashMap<Character, Integer>();
        // for (String word : words) {
            // if (word.charAt(0) == firstLetter) {
            //     fruitFound.put(firstLetter, count += 1);
            // }

        // }
        // return fruitFound;
        Map<Character, Integer> fruitFound = new HashMap<Character, Integer>();
        for (String word : words) {
            char firstLetter = word.charAt(0);
            if (fruitFound.get(firstLetter) == null) {
                fruitFound.put(firstLetter, 1);
            } else {
                fruitFound.put(firstLetter, fruitFound.get(firstLetter) + 1);
            }
        }
        return fruitFound;
    }
}
