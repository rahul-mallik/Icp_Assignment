package HomeAssignment2;
import java.util.*;
public class Hq02 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        double r, h, surfacearea,pi = Math.PI;  
        System.out.print("Enter the Radius : ");
        r = scn.nextDouble();
        System.out.print("Enter the height : ");
        h  = scn.nextDouble();
        surfacearea = pi*r*r + 2*pi*r*h;  
        System.out.println("Surface Area of Cylinder is: "+surfacearea);  


        scn.close();
    }
}
