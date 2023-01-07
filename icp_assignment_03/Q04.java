import java.util.Scanner;

public class Q04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter user number: ");
		int a= in.nextInt();
		int guess = (int)((10 - 1)*Math.random() + 1);
		System.out.println("Computer guesses: "+guess);
		
		
		if (a==guess)
			System.out.println("\"You got it right\"");
		else if(a-guess == -1 || a-guess == 1 )
			System.out.println("\"Almost got it\"");
		else
			System.out.println("\"You got it wrong\"");
	}
}
