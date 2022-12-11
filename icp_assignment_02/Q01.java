import java.util.Scanner;
public class Q01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter degree in Fahrenheit : ");
		double fahrenheit = in.nextDouble();
		
		double celsius = (fahrenheit - 32)*(5.0/9);
		
		System.out.println(fahrenheit + " Fahrenheit is "+celsius+" Celsius");
	}
}
