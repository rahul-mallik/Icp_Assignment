import java.util.Scanner;

public class Q05 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input the year: ");
		int a= in.nextInt();
		boolean cond = (a%100 != 0 && a%4 == 0);
		System.out.println(a + " is a leap year : "+cond);
		System.out.println(a + " is a leap year : "+cond);
		
	}
}
