package icp_lab1;

public class Cmd_HQ2 {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int h = Integer.parseInt(args[1]);
        double pi = Math.PI;

        System.out.println("Area of Cylinder : "+(int)(pi*r*r + 2*pi*r*h));

        /*
        Command line input
            javac Cmd_HQ2.java
            java Cmd_HQ2 10 6

        output
            691
         */
    }
}
