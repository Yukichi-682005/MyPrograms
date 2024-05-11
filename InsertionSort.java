public class InsertionSort {
    public static void main(String [] args){
        int[] arr = {8, 6, 2, 1, 4, 5, 7, 3};

        Sorting(arr);

        for(int i: arr){
            System.out.print(i);
        }
    }
    public static void Sorting(int[] arr){
        for(int i=1; i<arr.length; i++){
            int temp = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j] > temp ){
                arr[j+1] = arr[j];
                j--; 
            }
            arr[j+1] = temp;
        }
    }
}
