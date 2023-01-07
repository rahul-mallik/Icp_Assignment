import java.util.Scanner;

public class Q01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter age : ");
		int age = in.nextInt();
		
		if (age >= 18 )
			System.out.println("\"You are eligible to cast your vote\" ");
	}
}
