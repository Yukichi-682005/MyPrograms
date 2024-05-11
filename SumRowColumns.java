import java.util.Scanner;

class SumRowCalculation{
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

    void AddValue(int [][] arr1){
        int sumRow = 0;
        int sumColumn = 0;
        for(int i=0; i<3; i++){
            int resultRow = 0;
            int resultColumn = 0;
            for(int j=0; j<3; j++){
                resultRow += arr1[i][j];
                resultColumn += arr1[j][i];
            }
            sumRow += resultRow;
            sumColumn += resultColumn;
        }
        System.out.println("The sum of the rows of the matrix is:"+ sumRow);
        System.out.println("The sum of the rows of the matrix is:"+ sumColumn);
    }
}

public class SumRowColumns{
    public static void main(String [] args){
        SumRowCalculation obj = new SumRowCalculation();
        obj.GetValue();
    }
}