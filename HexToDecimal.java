import java.util.Scanner;

class Conversion{
    void hexTodecimal(String hex){
        hex = hex.toUpperCase();
        int decimal = 0;

        for(int i = 0; i < hex.length(); i++){
            char c = hex.charAt(i);
            int digitValue;

            if(c >= '0' && c <= '9'){
                digitValue = c - '0'; 
            }else{
                digitValue = 10 + (c - 'A');
            }
            decimal = decimal * 16 + digitValue;
        }
        System.out.println("Decimal value is:"+ decimal);
    }
}

public class HexToDecimal{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a hexadecimal number:");
        String hex = sc.nextLine();

        Conversion obj = new Conversion();
        obj.hexTodecimal(hex);
        
        sc.close();
    }
}