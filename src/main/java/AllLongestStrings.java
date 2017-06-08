import java.util.ArrayList;

/**
 * Given an array of strings, return another array containing all of its longest strings.

 Example

 For inputArray = ["aba", "aa", "ad", "vcd", "aba"], the output should be
 allLongestStrings(inputArray) = ["aba", "vcd", "aba"].

 Input/Output

 [time limit] 3000ms (java)

 [input] array.string inputArray

 A non-empty array.

 Guaranteed constraints:
 1 ≤ inputArray.length ≤ 10,
 1 ≤ inputArray[i].length ≤ 10.

 [output] array.string

 Array of the longest strings, stored in the same order as in the inputArray.
 */
public class AllLongestStrings {

    String[] allLongestStrings(String[] inputArray) {
        int maxLen = -1;
        ArrayList<String> strings = new ArrayList<>();

        for(int i=0; i < inputArray.length; i ++){
            if(inputArray[i].length() > maxLen){
                maxLen = inputArray[i].length();
                strings.clear();
            }
            if( inputArray[i].length() == maxLen )
                strings.add(inputArray[i]);
        }

        return strings.toArray(new String[strings.size()]);
    }
}
