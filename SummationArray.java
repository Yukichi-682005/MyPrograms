import java.util.Scanner;

class AddArray {
    int summation(int range) {
        Scanner sc = new Scanner(System.in);
        int[] sumArr = new int[range];
        int sum = 0;

        for (int i = 0; i < range; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            sumArr[i] = sc.nextInt();
        }

        for (int num : sumArr) {
            sum += num;
        }

        sc.close();
        return sum/range;
    }
}

public class SummationArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range of the input: ");
        int num = sc.nextInt();

        AddArray addArray = new AddArray();
        int result = addArray.summation(num);
        System.out.println("The average of the sum of the numbers entered is: " + result);

        sc.close();
    }
}
