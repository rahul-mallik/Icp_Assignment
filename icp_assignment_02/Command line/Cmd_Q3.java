public class Cmd_Q3{
    public static void main(String[] args) {
        int min = Integer.parseInt(args[0]);
        int max = Integer.parseInt(args[1])+1;
        int random1 = (int)((max - min)*Math.random() + min);
        int random2 = (int)((max - min)*Math.random() + min);
        System.out.println("First Random no. : "+random1);
        System.out.println("Second Random no. : "+random2);
        System.out.println("Their Sum : "+(random1+random2));

        /*
        Command line input
            javac Cmd_Q3.java
            java Cmd_Q3 1 6
            
        OUTPUT
            First Random no. : 4
            Second Random no. : 6
            Their Sum : 10
         */
    }
}