import java.util.Scanner;

class Calculating{
    void gettingArmstrong(int start, int end){
        System.out.println("The armstrong numbers are:");
        for(int i=start; i<=end; i++){
            if(checkingArmstrong(i) == i){
                System.out.println(i);
            }
        }
    }
    double checkingArmstrong(int value){
        int num = value;
        int count = 0;
        double rev = 0;
        while(value != 0){
            value /= 10;
            count++;
        }

        while(num != 0){
            int rem = num % 10;
            rev += Math.pow(rem, count);
            num /= 10;
        }
        return rev;
    }
}
public class ArmstrongNumBetween {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the initial range for the program:");
        int start = sc.nextInt();
        System.out.print("Enter the final range for the program:");
        int end = sc.nextInt();

        Calculating obj = new Calculating();
        obj.gettingArmstrong(start, end);

        sc.close();
    }
}
