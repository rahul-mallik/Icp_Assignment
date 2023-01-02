public class Cmd_Q4{
    public static void main(String[] args) {
        double t = (Double.parseDouble(args[0]));
        double cos = Math.cos(5*t), sin = Math.sin(7*t);
        System.out.println("the value of cos(5t)+sin(7t) = "+((cos+sin)));

        /* 
        Command line input 
            javac Cmd_Q4.java
            java Cmd_Q4 90
        
        OUTPUT
            the value of cos(5t)+sin(7t) = 0.2637290328324454
         */
    }
}