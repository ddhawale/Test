package my_world.assignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ddhawale on 7/8/15.
 */
public class PalindromeTest {
    public static void main(String args[])throws IOException {
        System.out.println(" ============ Program to test Palindrome Number ============");
        PalindromeTest palindromeTest = new PalindromeTest();
        int inputNumber = palindromeTest.getNumberFromConsole();
        if(palindromeTest.isNumberPalindrome(inputNumber))
            System.out.println(" Entered number - " + inputNumber + " is palindrome");
        else
            System.out.println(" Entered number - " + inputNumber + " is palindrome");
    }

    public int getNumberFromConsole()throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\n Please enter number - ");
        String userInput = br.readLine();
        return Integer.parseInt(userInput);
    }

    public boolean isNumberPalindrome(int inputNumber)  {
        int remainder;
        int reverseNumber = 0;
        while(inputNumber!=0) {
            remainder = inputNumber % 10;
            reverseNumber = (reverseNumber * 10) + remainder;
            inputNumber = inputNumber/10;
        }
        return inputNumber == reverseNumber;
    }
}
