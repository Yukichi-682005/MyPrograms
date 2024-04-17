import java.util.Scanner;

class CheckMaxMin{
    void check(int range){
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[range];
        for(int i=0; i<range; i++){
            System.out.print("Enter number "+ (i+1) +": ");
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for(int i=0; i<range; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("The maximum number in the array is:"+max);
        System.out.println("The minimum number in the array is"+min);

        sc.close();
    }
}

public class MaxMin {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of inputs you want:");
        int range = sc.nextInt();

        CheckMaxMin obj = new CheckMaxMin();
        obj.check(range);

        sc.close();
    }
}
