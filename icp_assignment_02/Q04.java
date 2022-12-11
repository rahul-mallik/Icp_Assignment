/*      Write a java program that reads an integer between 0 and 1000 and adds all the digits in the
		integer. For example, if an integer is 749, the sum of all its digits is 20.
		Hint: Use the % operator to extract digits, and use the /
		operator to remove the extracted digit.
		For instance, 749 % 10 = 9 and 749 / 10 = 74.
		Here is a sample run:
		Enter a number between 0 and 1000: 999 The sum of the
		digits is 27
*/


import java.util.Scanner;
public class Q04 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter an integer between(0 to 1000) : ");	
		int orig = scn.nextInt();
		int ones,tens,hund,sum;
		ones = orig%10;
		orig/=10;
		tens = orig%10;
		orig/=10;
		hund = orig;
		
		sum = ones+tens+hund;
		System.out.println("The sum of the digits is : "+sum);
	}
}