/*
	Enter the basic salary of an employee of an organization through the keyboard. His dearness
	allowance (DA) is 40% of basic salary, and house rent allowance (HRA) is 20% of basic
	salary. Write a java program to calculate his gross salary. Print the DA, HRA and Gross
	salary.
 */
import java.util.Scanner;
public class Q03 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the basic salary :");
		double salary = scn.nextDouble();
		
		double da = salary*40/100;
		double hra = salary*20/100;
		double gross = salary+da+hra;
		
		System.out.println("DA is "+da);
		System.out.println("HRA is "+hra);
		System.out.println("Gross is "+ gross);
	}
}
