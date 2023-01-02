
public class Cmd_HQ3 {
    public static void main(String[] args) {
        int l = Integer.parseInt(args[0])%10;
        int f = Integer.parseInt(args[0])/1000;

        System.out.println("Sum of first and last digit : "+(f+l));

        /*
        Command line input
            javac Cmd_HQ3.java
            java Cmd_HQ3 1056

        output
            7
         */
    }
}
