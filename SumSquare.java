import java.util.Scanner;
public class SumSquare{
    public static void main(String[] args){
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range of the number:");
        int range = sc.nextInt();
        
        for(int i=1; i<=range; i++){
            sum = sum + i*i;
        }

        System.out.println("The sum of the square of the numbers are:"+ sum);

        sc.close();
    }
}
