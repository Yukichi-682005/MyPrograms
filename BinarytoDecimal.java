import java.util.Scanner;
public class BinarytoDecimal {
    void toDecimal(String binary){
        int decimal = 0;
        int power = 0;
        for(int i=binary.length()-1; i >= 0; i--){
            int digit = binary.charAt(i) - '0';
            decimal += digit * Math.pow(2, power);
            power++;
        }
        System.out.println(binary+" in decimal is: "+decimal);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the binary number:");
        String binary = sc.nextLine();

        BinarytoDecimal obj = new BinarytoDecimal();
        obj.toDecimal(binary);
        sc.close();
    }
}
