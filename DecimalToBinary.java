import java.util.Scanner;

class Conversion {
    void operation(double n) {
        StringBuilder binary = new StringBuilder();
        long num = (long) n;

        while (num > 0){
            binary.insert(0, num%2);
            num /= 2;
        }
        System.out.println("In Binary:" + binary);
    }
}

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        double num = sc.nextDouble();

        Conversion obj1 = new Conversion();

        obj1.operation(num);
        
        sc.close();
    }
}