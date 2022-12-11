/*
		When a brick is dropped from a tower, it falls faster and faster until it hits the earth. The
		distance it travels is given by d = (1/2) gt 2
		Here d is in feet, t is the time in seconds, and g is 32.174.
		Write a program that asks the user for the number of seconds and then prints out the distance
		traveled.
		Here is the sample run:
		Enter the number of seconds: 5.4
		Distance traveled: 469.096
 */






import java.util.Scanner;
public class Q06 {
	public static void main(String[] args) {
		Scanner cnc= new Scanner(System.in);
		System.out.print("Enter the number of seconds: ");
		double d, g = 32.174, t = cnc.nextDouble();
		d= 1.0/2*g*(t*t);
		
		System.out.println("Distance traveled: "+d);
		
		
		
	}
}