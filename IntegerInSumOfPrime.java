import java.util.Scanner;
public class IntegerInSumOfPrime {
    public void splitInt(int num) {
        if (num == 1) {
            System.out.println(num + " cannot be represented as a sum of prime numbers");
            return;
        }
        for (int i = 2; i <= num / 2; i++) {
            int prime1 = checkPrime(i);
            int prime2 = checkPrime(num - i);
            if (prime1 != 0 && prime2 != 0) {
                System.out.println(num + " can be represented as a sum of " + i + " and " + (num - i) + " prime numbers");
                return;
            }
        }
        System.out.println(num + " cannot be represented as a sum of prime numbers");
    }
    public int checkPrime(int num) {
        if (num <= 1) {
            return 0;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return 0;
            }
        }
        return num;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer:");
        int num = sc.nextInt();

        IntegerInSumOfPrime obj = new IntegerInSumOfPrime();
        obj.splitInt(num);
        
        sc.close();
    }
}