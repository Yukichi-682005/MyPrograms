import java.util.Scanner;
public class Salary {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the basic salary:");
        float basic = sc.nextFloat();
        
        float DA = (basic * (10.0f/100));
        float HRA = (basic * (5.0f/100));

        float salary = basic + DA + HRA;

        System.out.print("The total salary recieved by you is:"+ salary);

        sc.close();
    }
}
