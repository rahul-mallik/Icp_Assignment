import java.util.Scanner;

public class Q08 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the x – y coordinates of a point : ");
		double x = in.nextDouble(), y = in.nextDouble();
		
		if (x>0 && y>0)
			System.out.println("("+x+" , "+y+") is in quadrant I");
		else if (x<0 && y>0)
			System.out.println("("+x+" , "+y+") is in quadrant II");
		else if (x<0 && y<0)
			System.out.println("("+x+" , "+y+") is in quadrant III");
		else if (x>0 && y<0)
			System.out.println("("+x+" , "+y+") is in quadrant IV");
		else if (x == 0 && y != 0)
			System.out.println("("+x+" , "+y+") is on y axis");
		else if (y == 0 && x != 0)
			System.out.println("("+x+" , "+y+") is on x aixs");
		else
			System.out.println("("+x+" , "+y+") is on origin");
	}
}
