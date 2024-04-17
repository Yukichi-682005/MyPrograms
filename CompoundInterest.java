import java.util.Scanner;
class Calculation{
    void interest(int p, float r, int t, int n){
        double CI = p * Math.pow((1 + (r / (n * 100))), n * t);

        System.out.println("The compound interst is:"+CI);
    }
}

public class CompoundInterest {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Calculating Compound interest:");

        System.out.print("Enter principal:");
        int p = sc.nextInt();

        System.out.print("Enter Rate(%):");
        float r = sc.nextFloat();

        System.out.print("Enter Time(in years):");
        int t = sc.nextInt();

        System.out.print("Enter the frequency of compound per year:");
        int n = sc.nextInt();

        Calculation obj = new Calculation();
        obj.interest(p, r, t, n);

        sc.close();
    }
}
