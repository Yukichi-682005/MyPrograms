import java.util.Scanner;

class Check{
    boolean CheckPrime(int num){
        if(num <= 1){
            return false;
        }
        for(int i=2; i*i <= num; i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }

    void print(int num){
        boolean check = new Check().CheckPrime(num);
        if(check){
            System.out.println(num + " is a prime number");
        }else{
            System.out.println(num + " is not a prime number");
        }
    }
}

public class PrimeNum {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();

        if(num < 0){
            System.out.println("Please enter a positive number");
        }else{
            Check obj = new Check();
            obj.print(num);
        }
        sc.close();
    }
}
