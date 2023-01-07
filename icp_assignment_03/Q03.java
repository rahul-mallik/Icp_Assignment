import java.util.Scanner;

public class Q03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 1st integer : ");
		int a= in.nextInt();
		System.out.println("Enter 2nd integer : ");
		int b= in.nextInt();
		System.out.println("Enter 3rd integer : ");
		int c= in.nextInt();
		
		if (a>b && b>c)
			System.out.println("\"Decreasing\"");
		else if(a<b && b<c)
			System.out.println("\"Increasing\"");
		else
			System.out.println("\"Neither Increasing nor decreasing\"");
	}
}
