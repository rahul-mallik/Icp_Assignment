import java.util.Scanner;

public class Q07 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("No. of units consumed: ");
		double dis = 0,bill = 0,unit = in.nextInt();
		
		if (unit<=50)
			bill = unit*3;
		else if (unit <= 200 && unit >50)
			bill = 50*3 +(unit-50)*4.8;
		else if (unit <= 400 && unit >200)
			bill = 50*3 +150*4.8 +(unit-200)*5.8;
		else if (unit > 400 )
			bill = 50*3 + 150*4.8 + 200*5.8 + (unit-400)*6.2;

		
		System.out.println("Do you want to pay the bill onine (y/n): ");
		char ch = in.next().charAt(0);
		
		System.out.println("Total amount : "+bill);
		
		if (ch =='y') {
			dis = (0.03)*bill;
			System.out.println("Discount: "+dis);
			System.out.println("Amount payable: "+(bill-dis));
		}else
			System.out.println("Amount payable: "+bill);
		
		
			
			
			
		
		
		
	}
}
