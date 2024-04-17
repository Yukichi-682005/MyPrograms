import java.util.Scanner;
public class Palindrome {
    public static void main(String [] args){
        int num, copy, rem, rev = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        num = sc.nextInt();
        copy = num;

        while(num>0){
            rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10; 
        }
        if(copy == rev){
            System.out.println("The number is a palindrome number");
        }
        else{
            System.out.println("The number is not a palindrome number");
        }

        sc.close();
    }
}
