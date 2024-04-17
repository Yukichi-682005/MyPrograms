import java.util.Scanner;

class ArmstrongNumber {
    int countDigit(int n) {
        int count = 0;
        while (n != 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    boolean isArmstrong(int num) {
        int originalNum = num;
        int count = countDigit(num);
        double sum = 0;

        while (num != 0) {
            int rem = num % 10;
            sum += Math.pow(rem, count);
            num /= 10;
        }

        return sum == originalNum;
    }
}

class Display {
    void print(boolean isArmstrong, int num) {
        if (isArmstrong) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }
}

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            ArmstrongNumber armstrongNumber = new ArmstrongNumber();
            boolean isArmstrong = armstrongNumber.isArmstrong(num);
            Display display = new Display();
            display.print(isArmstrong, num);
        }

        sc.close();
    }
}
