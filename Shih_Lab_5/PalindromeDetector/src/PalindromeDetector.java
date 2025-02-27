/**
 * Class determines which words are palindromes
 * Written by Winston Shih
 * Written on 7/4/2023
 * JDK Version 17.0.1
 */
public class PalindromeDetector {
    public static void main(String[] args) {
        //Array holds 5 words that will be tested to see if they are palindromes
        String[] test={"Rotator", "Hello there!", "Step on no pets", "The only thing we have to fear is fear itself", "level"};
        //Tests all words in test array to see if they are palindromes.
        for (int i = 0; i < test.length; i++)
        {
            System.out.print("\"" + test[i] + "\"");
            if (isPalindrome(test[i].toUpperCase()))
            {
                System.out.println(" is a palindrome.");
            }
            else
            {
                System.out.println(" is not a palindrome.");
            }
      }
    }
    /**
     * Method determines if a word is palindrome.
     * @param str String that will be tested if it is a palindrome or not.
     * @return status Returns true is word is palindrome or false if not.
     */
     public static boolean isPalindrome(String str)
     {
        boolean status = false;
        if (str.length() <= 1)
        {
            status = true;
        }
        else if (str.charAt(0) == str.charAt(str.length()-1))
        {
            status = isPalindrome (str.substring (1, str.length()-1));
        }
        return status;
   }
}
