import java.util.Scanner;
public class Division {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st number:");
        int num1 = sc.nextInt();
        System.out.print("Enter the 1st number:");
        int num2 = sc.nextInt();

        float quo = num1/num2;
        float rem = num1%num2;

        System.out.println(quo);
        System.out.print(rem);

        sc.close();
    }
}
