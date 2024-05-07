import java.util.Scanner;

class AddingDiagonals{
    void GetValue(){
        Scanner sc = new Scanner(System.in);
        int [][] arr1 = new int[3][3];

        System.out.println("Enter the values for the matrix:");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print("Enter the value at position "+ (i+1) + (j+1) +" :");
                arr1[i][j] = sc.nextInt();
            }
        }
        AddValue(arr1);
        sc.close();
    }
    void AddValue(int[][] arr1){
        int result = 0;
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(i==j){
                    result += arr1[i][j];
                }
            }
        }
        System.out.println("The sum of the diagonals of the matrix is:"+result);
    }
}

public class DiagonalAddition {
    public static void main(String [] args){
        AddingDiagonals obj = new AddingDiagonals();
        obj.GetValue();
    }
}
