import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num, num1 = 1, num2 = 1;
        System.out.print("Enter the range of the fibonacci series:");
        int range = sc.nextInt();
        System.out.println(num1);
        System.out.println(num2);

        for(int i=3; i<=range; i++){
            num = num1 + num2;
            num1 = num2;
            num2 = num;
            System.out.println(num);
        }
        sc.close();
    }
}
