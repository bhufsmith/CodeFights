/**
 Ticket numbers usually consist of an even number of digits. A ticket number is considered lucky if the sum of the first half of the digits is equal to the sum of the second half.

 Given a ticket number n, determine if it's lucky or not.

 Example

 For n = 1230, the output should be
 isLucky(n) = true;
 For n = 239017, the output should be
 isLucky(n) = false.

 Input/Output

 [time limit] 3000ms (java)

 [input] integer n

 A ticket number represented as a positive integer with an even number of digits.

 Guaranteed constraints:
 10 ≤ n < 106.

 [output] boolean

 true if n is a lucky ticket number, false otherwise.

 */
public class IsLucky {

    boolean isLucky(int n) {
        int digits = Integer.toString(n).length() / 2;

        int sum = 0;
        int firstHalf = 0;
        int counter = 0;
        while( firstHalf == 0 ) {
            firstHalf = sum;
            sum = 0;

            for(; counter < digits; counter++){
                sum += n % 10;
                n = n / 10;
            }
            digits *= 2;
        }
        return firstHalf == sum;
    }

    public static void main(String[] args){
        IsLucky number = new IsLucky();

        assert (number.isLucky(1230));
        assert (number.isLucky(100001));
        assert (number.isLucky(36012620));
        assert ( ! number.isLucky(111000));
        assert ( ! number.isLucky(4000));
        assert ( ! number.isLucky(888019));
    }
}
