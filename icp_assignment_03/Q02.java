import java.util.Scanner;

public class Q02 {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the amount of water drank today by alice : ");
	int age = in.nextInt();
	
	if (age >= 5000 )
		System.out.println("\"Yes, Alice is following doctor’s advice\" ");
	else 
		System.out.println("\"No, Alice is not following doctor’s advice\" ");
	}
}
