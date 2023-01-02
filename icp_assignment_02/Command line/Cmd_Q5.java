public class Cmd_Q5{
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);

        int max = Math.max(num2, Math.max(num1, num3));
        int min = Math.min(num2, Math.min(num1, num3));
        int mid = (num1+num2+num3) - (max + min);

        System.out.println("Ascending order : " + min +" " + mid +" "+max);


        /*
         Command line input
            javac Cmd_Q5.java
            java Cmd_Q5 10 58 2

        Output
            Ascending order : 2 10 58
         */
    }
}