import java.util.Scanner;

public class Q09 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the value of a, b, c: ");
		int a= in.nextInt(),b= in.nextInt(),c= in.nextInt();
		
		if (a>b && a>c) {
			System.out.println("Largest no : "+a);
			if (b>c)
				System.out.println("2nd Largest : "+b);
			else 
				System.out.println("2nd largest : "+c);
		}else if (b>a && b>c) {
			System.out.println("Largest no : "+b);
			if (a>c)
				System.out.println("2nd Largest : "+a);
			else 
				System.out.println("2nd largest : "+c);
		}else {
			System.out.println("Largest no : "+c);
			if (b>a)
				System.out.println("2nd Largest : "+b);
			else 
				System.out.println("2nd largest : "+a);
		}
		
	}
}
