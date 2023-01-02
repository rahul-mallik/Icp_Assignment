public class Cmd_Q1{
    public static void main(String[] args) {
        int dividend = Integer.parseInt(args[0]);
        int divisor = Integer.parseInt(args[1]);
        System.out.println("Quotient : "+(dividend/divisor));
        System.out.println("Reaminder : "+(dividend%divisor));


        /* 
        Command line input 
            javac Cmd_Q1.java
            java Cmd_Q1 5 3
        
        OUTPUT
            Quotient : 1
            Remainder : 2
         */
    }
}