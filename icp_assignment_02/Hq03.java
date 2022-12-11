package HomeAssignment2;
import java.util.*;
public class Hq03 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter any 4 digit number : ");
        int integer = scn.nextInt();

        int f,l;

        l = integer%10;
        f = integer/100;

        System.out.print("The sum of the last and first digit is "+ (l+f));

        scn.close();
    }
}
