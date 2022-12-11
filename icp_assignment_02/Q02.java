import java.util.*;
public class Q02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the distance between 2 cicties(in km): ");
		double dist = in.nextInt();
		
		double meter = dist*1000;
		double feet = dist*3280.8399;
		double centimeter = dist*100000;
		double inch = dist*39370.0787;
		System.out.println(dist+" km is "+meter+" meters");
		System.out.println(dist+" km is "+feet+" feet");
		System.out.println(dist+" km is "+inch+" inch");
		System.out.println(dist+" km is "+centimeter+" centimeters");
		
	}
}
