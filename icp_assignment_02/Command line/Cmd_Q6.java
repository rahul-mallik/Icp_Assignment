public class Cmd_Q6{
    public static void main(String[] args) {
        char ch = args[0].charAt(0);
        System.out.println("ASCII Value of "+ch+" is "+ (int)ch);

        /* 
        Command line input 
            javac Cmd_Q6.java
            java Cmd_Q6 $
        
        OUTPUT
            ASCII Value of $ is 36
            
         */
    }
}