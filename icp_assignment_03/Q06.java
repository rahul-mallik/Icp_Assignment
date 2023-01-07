import java.util.Scanner;

public class Q06 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("No. of units consumed: ");
		double bill = 0,unit = in.nextInt();
		
		if (unit<=50)
			bill = unit*3;
		else if (unit <= 200 && unit >50)
			bill = 50*3 +(unit)*4.8;
		else if (unit <= 400 && unit >200)
			bill = 50*3 +200*4.8 +(unit-200)*5.8;
		else if (unit > 400 )
			bill = 50*3 + 200*4.8 + 400*5.8 + (unit-400)*6.2;
		
		System.out.println("Total amount : "+bill);
			
			
		
		
		
	}
}
