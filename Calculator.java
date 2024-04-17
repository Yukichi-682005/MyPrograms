import java.util.Scanner;
public class Calculator {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st number:");
        int num1 = sc.nextInt();
        System.out.print("Enter the 2nd number:");
        int num2 = sc.nextInt();
        System.out.println("Choose what operation do u want to perform on the number:");
        System.out.println("Enter + for addition:");
        System.out.println("Enter - for substraction:");
        System.out.println("Enter * for multiplication:");
        System.out.println("Enter / for division:");
        int ch = sc.next().charAt(0);

        switch(ch){
            case '+':
            System.out.println("The sum of the numbers entered by you is:"+ (num1 + num2));
            break;
            case '-':
            System.out.println("The difference of the numbers entered by you is:"+ (num1 - num2));
            break;
            case '*':
            System.out.println("The product of the numbers entered by you is:"+ (num1 * num2));
            break;
            case '/':
            System.out.println("The quotient of the numbers entered by you is:"+ (num1 / num2));
            break;
            default:
            System.out.println("Invalid input");
            break;
        }
        sc.close();
    }
}
