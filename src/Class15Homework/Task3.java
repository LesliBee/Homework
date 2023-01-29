package Class15Homework;

public class Task3 {
    //Create a method that will print whether given String is palindrome or not.
    boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        if (str.equals(reversed)) {
            return true;
        } else {
            return false;
        }

    }
}
