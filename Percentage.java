import java.util.Scanner;
public class Percentage {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = sc.nextLine();

        System.out.println("Enter your marks:");
        System.out.print("Enter the marks for English:");
        int eng = sc.nextInt();
        System.out.print("Enter the marks for Computer Science:");
        int comp = sc.nextInt();
        System.out.print("Enter the marks for Physics:");
        int phy = sc.nextInt();
        System.out.print("Enter the marks for Chemistry:");
        int chem = sc.nextInt();
        System.out.print("Enter the marks for Mathematics:");
        int math = sc.nextInt();

        float add = (eng + comp + phy + chem + math);
        float percentage = (add/500)*100;

        System.out.print("The percentage obtained by" + name +" " + "is:" + percentage +"%");

        sc.close();
    }
}
