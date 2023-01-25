package Icp_assignment04;

public class Hq1 {
    public static void main(String[] args) {

        int sq = 0 ,sum =0;
        for(int i =1 ; i<=10 ; i++){
            sq += (int) Math.pow(i,2);
            sum += i;
        }
        int sum2 = (int)Math.pow(sum,2);
        System.out.println("The sum of the squares of the first ten natural numbers is: "+sq);
        System.out.println("The square of the sum of the first ten natural numbers is: "+sum2);
        System.out.println("Hence the difference between the sum of the squares of the first\n" +
                "ten natural numbers and the square of the sum is " +sum2+" - "+sq + " = "+(sum2-sq) );
    }
}
