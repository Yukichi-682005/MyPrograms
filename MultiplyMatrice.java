import java.util.Scanner;
class MultiplyingMatrice{
    void GetValue(){
        int [][] matrice1 = new int [3][3];
        int [][] matrice2 = new int [3][3];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the values of the 1st matrice:");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print("Enter the value in the position "+ i + j + ":");
                matrice1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the values of the 2st matrice:");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print("Enter the value in the position "+ i + j + ":");
                matrice2[i][j] = sc.nextInt();
            }
        }
        sc.close();

        Multiplying(matrice1, matrice2);
    }
    void Multiplying(int[][] matrice1, int[][] matrice2){
        int [][] mul = new int [3][3];
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                mul[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    mul[i][j] += matrice1[i][k] * matrice2[k][j];
                }
            }
        }
        System.out.println("Multiplication of the matrices:");
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(mul[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class MultiplyMatrice {
    public static void main(String [] args){
        MultiplyingMatrice obj = new MultiplyingMatrice();
        obj.GetValue();
    }
}
