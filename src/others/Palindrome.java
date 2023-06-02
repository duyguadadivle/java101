package others;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String word = input.nextLine();
        System.out.println(isPalindrome(word));

    }

    private static boolean isPalindrome(String word) {

        String reverse = "";
        for(int i=word.length()-1; i>=0; i--){
            reverse += (word.charAt(i));
        }
        if (word.equals(reverse)){
            System.out.println("Reverse of the input is " + reverse + " is palindrome ");
            return true;
        }
        else {
            System.out.println("Reverse of the input is " + reverse + " is not palindrome ");
            return false;
        }
    }

}
