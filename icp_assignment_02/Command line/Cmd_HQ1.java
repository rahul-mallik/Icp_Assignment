package icp_lab1;

public class Cmd_HQ1 {
    public static void main(String[] args) {
        int principle = Integer.parseInt(args[0]);
        int rate = Integer.parseInt(args[1]);
        int time = Integer.parseInt(args[2]);
        System.out.println("Simple Interest : "+ (principle*(1+rate*time)));

        /*
        Command line input
            javac Cmd_HQ1.java
            java Cmd_HQ1 10 5 3

        output
            160
         */
    }
}
