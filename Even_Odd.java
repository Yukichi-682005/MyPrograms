import java.util.Scanner;
public class Even_Odd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        
        if(num % 2 == 0){
            System.out.println("The number you entered is an even number");
        }
        else{
            System.out.println("The number you entered is an odd number");
        }
        sc.close();
    }
}
