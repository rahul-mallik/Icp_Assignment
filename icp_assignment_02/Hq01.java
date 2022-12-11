package HomeAssignment2;

import java.util.*;
public class Hq01 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the principle : ");
        double p = scn.nextDouble();

        System.out.print("Enter the rate : ");
        double r = scn.nextDouble();

        System.out.print("Enter the time : ");
        double t =  scn.nextDouble();

        double simple_int = p*(1+r*t);

        System.out.println("Simple Interest : "+simple_int);

        scn.close();
    }
    
}
