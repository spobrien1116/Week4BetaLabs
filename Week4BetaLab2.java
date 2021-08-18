import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;

public class Week4BetaLab2 {

    public static void main(String[] args) {
        // Write and test a method that takes a list of strings and a string and returns a new list with all
        // strings from the original list containing the second string parameter (i.e. like a search method).
        List<String> pizzaToppings = new ArrayList<String>();
        pizzaToppings.add("Cheese");
        pizzaToppings.add("Pepperoni"); 
        pizzaToppings.add("Red Pepper"); 
        pizzaToppings.add("Onion");
        pizzaToppings.add("Green Pepper");
        String findTopping = "Pepper";
        System.out.println(findItem(pizzaToppings, findTopping));
        // Write and test a method that takes a list of integers and returns a List<List<Integer>> where the
        // first list in the returned value contains any number from the input list that is divisible by 2,
        // the second list contains values from the input list that are divisible by 3, the third divisible
        // by 5, and the fourth all numbers from the input list not divisible by 2, 3, or 5.
        List<Integer> listofNumbers = new ArrayList<Integer>();
        listofNumbers.add(10);
        listofNumbers.add(20);
        listofNumbers.add(30);
        listofNumbers.add(31);
        List<List<Integer>> numbersSorted = divideTheList(listofNumbers);
        System.out.println("Numbers divisible by 2:");
        System.out.println(numbersSorted.get(0));
        System.out.println("Numbers divisible by 3:");
        System.out.println(numbersSorted.get(1));
        System.out.println("Numbers divisible by 5:");
        System.out.println(numbersSorted.get(2));
        System.out.println("Numbers not divisible by 2, 3, or 5:");
        System.out.println(numbersSorted.get(3));
        // Write and test a method that takes a list of Strings and returns a list of Integers that contains
        // the length of each String.
        List<Integer> toppingWordLengths = stringLengths(pizzaToppings);
        for (int i = 0; i < toppingWordLengths.size() - 1; i++) {
            System.out.println(pizzaToppings.get(i) + " word length is: " + toppingWordLengths.get(i));
        }
        // Create a set of Strings and add 5 values
        Set<String> tubeman = new HashSet<String>();
        tubeman.add("Wacky");
        tubeman.add("Waving");
        tubeman.add("Inflatable");
        tubeman.add("Arm");
        tubeman.add("Flailing");
        // Write and test a method that takes a set of Strings and a character and returns a set of Strings
        // consisting of all the Strings in the input set that start with the character parameter.
        char startingLetter = 'W';
        Set<String> startsWithLetter = beginsWithChar(tubeman, startingLetter);
        System.out.println("Words that begin with " + startingLetter);
        for (String word : startsWithLetter) {
            System.out.println(word);
        }
        // Write and test a method that takes a set of Strings and returns a list of the same Strings.
        List<String> setInListForm = setToList(tubeman);
        System.out.println("Set has been converted to list. List is as follows:");
        for (String word : setInListForm) {
            System.out.println(word);
        }
    }
    // Write and test a method that takes a list of strings and a string and returns a new list with all
    // strings from the original list containing the second string parameter (i.e. like a search method).
    public static List<String> findItem(List<String> toppings, String search) {
        List<String> itemList = new ArrayList<String>();
        for (String item : toppings) {
            if (item.contains(search)) {
                itemList.add(item );
            }
        }
        return itemList;
    }
    // Write and test a method that takes a list of integers and returns a List<List<Integer>> where the
    // first list in the returned value contains any number from the input list that is divisible by 2,
    // the second list contains values from the input list that are divisible by 3, the third divisible
    // by 5, and the fourth all numbers from the input list not divisible by 2, 3, or 5.
    public static List<List<Integer>> divideTheList(List<Integer> numbers) {
        List<Integer> divisibleBy2 = new ArrayList<Integer>();
        List<Integer> divisibleBy3 = new ArrayList<Integer>();
        List<Integer> divisibleBy5 = new ArrayList<Integer>();
        List<Integer> notDivisible = new ArrayList<Integer>();
        for (int number : numbers) {
            if (number % 2 == 0) {
                divisibleBy2.add(number);
            }
            if (number % 3 == 0) {
                divisibleBy3.add(number);
            }
            if (number % 5 == 0) {
                divisibleBy5.add(number);
            }
            if (number % 2 != 0 && number % 3 != 0 && number % 5 != 0) {
                notDivisible.add(number);
            }
        }
        List<List<Integer>> listOfLists = new ArrayList<List<Integer>>();
        listOfLists.add(divisibleBy2);
        listOfLists.add(divisibleBy3);
        listOfLists.add(divisibleBy5);
        listOfLists.add(notDivisible);
        return listOfLists;
    }
    // Write and test a method that takes a list of Strings and returns a list of Integers that contains the
    // length of each string.
    public static List<Integer> stringLengths(List<String> words) {
        List<Integer> wordLengths = new ArrayList<Integer>();
        for (String word : words) {
            wordLengths.add(word.length());
        }
        return wordLengths;
    }
    // Write and test a method that takes a set of Strings and a character and returns a set of Strings
    // consisting of all the Strings in the input set that start with the character parameter.
    public static Set<String> beginsWithChar(Set<String> words, char firstLetter) {
        Set<String> beginsWithFirstLetter = new HashSet<String>();
        for (String word : words) {
            if (word.charAt(0) == firstLetter) {
                beginsWithFirstLetter.add(word);
            }
        }
        return beginsWithFirstLetter;
    }
    // Write and test a method that takes a set of Strings and returns a list of the same Strings.
    public static List<String> setToList(Set<String> words) {
        List<String> wordsAsList = new ArrayList<String>();
        for (String word : words) {
            wordsAsList.add(word);
        }
        return wordsAsList;
    }
}
