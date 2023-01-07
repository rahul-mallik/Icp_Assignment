import java.util.Scanner;
public class Q10 {
  public static void main(String[] args){
  Scanner in = new Scanner(System.in);
  int mrks = in.nextInt();
  int tens = mrks/10;
  // for convinence using the below codes but for exams follow the old switch case syntax 
  switch(tens){
    case 10 -> System.out.print("O");
    case 9 -> System.out.print("A");
    case 8 -> System.out.print("B");
    case 7 -> System.out.print("C");
    case 6 -> System.out.print("D");
    case 5 -> System.out.print("E");
    case 4,3,2,1,0 -> System.out.print("F");
    default -> System.out.print("Invalid Input :( ");
  
  }
 }

}
