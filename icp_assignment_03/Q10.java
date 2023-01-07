import java.util.Scanner;
public class Q10 {
  public static void main(String[] args){
  Scanner in = new Scanner(System.in);
  int mrks = in.nextInt();
  int tens = mrks/10;
  // for convinence using the below codes but for exams follow the old switch case syntax 
  switch(tens){
    case 10,9 -> System.out.print("O");
    case 8 -> System.out.print("A");
    case 7 -> System.out.print("B");
    case 6 -> System.out.print("C");
    case 5 -> System.out.print("D");
    case 4 -> System.out.print("E");
    case 3,2,1,0 -> System.out.print("F");
    default -> System.out.print("Invalid Input :( ");
  
  }
 }

}
