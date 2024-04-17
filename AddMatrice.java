import java.util.Scanner;

class AddingMatrice{
    void InitializingMatrice(){
        int [][] matrice1 = new int[3][3];
        int [][] matrice2 = new int[3][3];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the values of the first matrice:");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print("Enter the value in the location "+ i + j);
                matrice1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the values of the second matrice:");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print("Enter the value in the location "+ i + j);
                matrice2[i][j] = sc.nextInt();
            }
        }
        sc.close();

        AddMatrices(matrice1, matrice2);
    }

    void AddMatrices(int[][] matrice1, int[][] matrice2) {
        int[][] sum = new int[3][3];
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                sum[i][j] = matrice1[i][j] + matrice2[i][j];
            }
        }
        System.out.println("Sum of the matrices:");
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
public class AddMatrice {
    public static void main(String [] args){
        AddingMatrice obj = new AddingMatrice();
        obj.InitializingMatrice();
    }
}
