import java.util.Scanner;

class TransposingMatrix{
    void GetValue(){
        int [][] matrix = new int [3][3];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the values of the matrice:");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print("Enter the value in the position "+ i + j + ":");
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.close();

        Transposing(matrix);
    }

    void Transposing(int [][] matrix){
        int [][] transpose = new int[3][3]; 
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                transpose[i][j] = matrix[j][i];
            }
        }
        System.out.println("The transpose of the matrix is:");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
public class TransposeMatrix {
    public static void main(String [] args){
        TransposingMatrix obj = new TransposingMatrix();
        obj.GetValue();
    }
}
