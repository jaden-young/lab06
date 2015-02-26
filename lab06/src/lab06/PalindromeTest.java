package lab06;

import java.util.Scanner;

/**
 * Checks whether or not a string is a palindrome.
 * Ignores all characters that are not letters
 * @author Jaden Young
 */
public class PalindromeTest {
	
	static boolean isPalindrome(String input) {
		//i.e. if the string has length 0 or 1
		if(input.length() < 2)
			return true;
		
		//if the characters at each end are the same, checks the next inner 2
		if(input.charAt(0) == input.charAt(input.length() - 1))
			return isPalindrome(input.substring(1, input.length() - 1));
		
		//lops off the first character if it is not a letter
		if(!Character.isLetter(input.charAt(0)))
			return isPalindrome(input.substring(1, input.length()));
		
		//lops off the last character if it is not a letter
		if(!Character.isLetter(input.charAt(input.length() - 1)))
			return isPalindrome(input.substring(0, input.length() - 1));
		
		//if the characters were not the same, return false
		return false;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("------- Palindrome Checker -------");
		System.out.print("Type a word or phrase > ");
		
		if(isPalindrome(scan.nextLine()))
			System.out.println("That is a palindrome.");
		else
			System.out.println("That is not a palindrome.");
	}
}
