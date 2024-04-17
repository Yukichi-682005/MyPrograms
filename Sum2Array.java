import java.util.Scanner;

class GetArray{
    void inputArray(int range){
        Scanner sc = new Scanner(System.in);

        int[] arr1 = new int[range];
        int[] arr2 = new int[range];
        int[] sum = new int[range];

        System.out.println("Enter numbers for Array 1:");
        for (int i = 0; i < range; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter numbers for Array 2:");
        for (int i = 0; i < range; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            arr2[i] = sc.nextInt();
        }

        for (int i = 0; i < range; i++) {
            sum[i] = arr1[i] + arr2[i];
        }

        System.out.println("After summation, the new array is:");
        for (int i = 0; i < range; i++) {
            System.out.println(sum[i]);
        }
        sc.close();
    }
}

public class Sum2Array {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range of the number of inputs:");
        int range = sc.nextInt();

        GetArray obj = new GetArray();
        obj.inputArray(range);
        sc.close();
    }
}
