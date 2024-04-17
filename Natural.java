import java.util.Scanner;
public class Natural {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range of the numbers:");
        int range = sc.nextInt();
        for(int i = 1; i<=range; i++){
            System.out.println(i);
        }
        sc.close();
    }
}
