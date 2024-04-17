import java.util.Scanner;
class RevNum{
    int function(int n){
        int rem, rev=0;
        while(n != 0){
            rem = n%10;
            rev = rev*10 + rem;
            n /= 10;
        }
        return rev;
    }

    void Result(int input){
        int num = function(input);
        System.out.print("The reverse of the number is:"+ num);
    }
}

public class Reverse {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();

        RevNum obj1 = new RevNum();
        obj1.Result(num);

        sc.close();
    }
}
