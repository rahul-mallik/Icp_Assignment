
import java.util.Scanner;

public class MenuDrivenProgram {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of Array :");
        int l = in.nextInt();
        int[] arr = new int[l];
        for(int i = 0; i<arr.length;i++){
            System.out.print("Enter the no. to be added:");
            int arr_in = in.nextInt();
            arr[i] = arr_in;
        }

        while(true){
            System.out.println("Options :\n" +
                    "0. Quit\n" +
                    "1. Display\n" +
                    "2. Delete\n" +
                    "3. Search\n" +
                    "4. Reverse\n" +
                    "5. Sort\n" +
                    "6. Find maximum\n" +
                    "7. Find 2nd maximum\n" +
                    "8. Find largest prime");
            System.out.print("Enter your choice: ");
            int choice = in.nextInt();
            if (choice == 0 )
                break;
            switch (choice){
                case 1:
                    System.out.println("Your array : ");
                    display(arr);
                    break;
                case 2:
                    System.out.println("Your array : ");
                    display(arr);
                    System.out.print("Enter the element you want to delete: ");
                    int ele = in.nextInt();
                    delete(arr,ele);
                    System.out.println("Your array after deleting "+ele+": ");
                    display(arr);
                    break;
                case 3:
                    System.out.print("Enter the element you want to search: ");
                    ele = in.nextInt();
                    if(search(arr,ele)!= 0)
                        System.out.println("Index value of the element "+ele+" is "+search(arr,ele));
                    else
                        System.out.println("Element you want to search is not in the array");
                    break;
                case 4:
                    System.out.println("Your array : ");
                    display(arr);
                    System.out.println("Your array after It's reversed :");
                    reverse(arr);
                    display(arr);
                    break;
                case 5:
                    System.out.println("Your array : ");
                    display(arr);
                    System.out.println("Your array after sorting :");
                    sort(arr);
                    display(arr);
                    break;
                case 6:
                    System.out.println("Largest number in the array is: "+maximum(arr));
                    break;
                case 7:
                    System.out.println("2nd largest number in the array is: "+maximum_2nd(arr));
                    break;
                case 8:
                    System.out.println("Largest prime no. in the array is: "+largest_prime(arr));
                    break;
                default:
                    System.out.println(":( Invalid input....");
            }
        }
    }

    static void display(int[] array){
        System.out.print("[");
        for(int i = 0; i<array.length;i++ ){
            System.out.print(array[i]);
            if(i!= array.length-1)
                System.out.print(", ");
        }
        System.out.println("]");
    }

    static void delete(int[] array,int element){
        int i = 0;
        for (; i<array.length;i++){
            if (array[i]==element)
                array[i] = 0;
        }
    }
    static int search(int[] array, int element){
        int index =0;
        for (int i =0; i<array.length ;i++ ){
            if(array[i] == element){
                index = i;
            }
        }
        return index;
    }

    static void reverse(int[] array){
        int j = array.length-1;
        for (int i = 0 ; i<j-i ; i++){
            int temp = array[j-i];
            array[j-i]=array[i];
            array[i]=temp;
        }
    }

    static void sort(int[] array){
        for(int i = array.length-1 ; i>0 ; i--){
            for (int j = 0 ; j<i ;j++){
                if(array[j]>array[j+1]){
                    int temp = array[j+1];
                    array[j+1]=array[j];
                    array[j]=temp;
                }
            }
        }
    }

    static int maximum(int[] array){
        int max_val = 0;
        for(int i =0 ; i< array.length ; i++){
            if (array[i]> max_val)
                max_val = array[i];
        }
        return max_val;
    }

    static int maximum_2nd(int[] array){
        int second_max = 0;
        int max_value = maximum(array);
        for(int i =0 ; i< array.length ; i++){
            if (array[i]> second_max && array[i]<max_value)
                second_max = array[i];
        }
        return second_max;
    }

    static int largest_prime(int[] array){
        int c,l_prime=0;
        for (int i = 0; i< array.length ; i++){
            for(c = 2; c*c<=array[i] ; c++){
                if(array[i]%c==0)
                    break;
            }
            if (c*c>array[i] && array[i]>l_prime){
                l_prime = array[i];
            }
        }
        return l_prime;
    }
}
