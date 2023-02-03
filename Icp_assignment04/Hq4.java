package Icp_assignment04;
/* OUTPUT

For input, N = 10
Sum of all even numbers = 2 + 4 + 6 + 8 + 10 = 30
Product of all odd numbers = 1 * 3 * 5 * 7 * 9 = 945
 */
import java.util.Scanner;

public class Hq4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("For input, N =");
        int n = in.nextInt(),sum=0,product=1;

        System.out.print("Sum of all even numbers = ");
        for(int i = 1; i<=n ;i++){
            if(i%2==0) {
                System.out.print(i + " + ");
                sum += i;
            }
        }
        System.out.println(" = "+sum);
        System.out.print("Product of all odd numbers = ");
        for(int i = 1; i<=n ;i++){
            if(i%2!=0) {
                System.out.print(i + " * ");
                product *= i;
            }
        }
        System.out.println(" = "+product);
    }
}
