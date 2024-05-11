public class BubbleSort {
    public static void main(String [] args){
        int arr[] = {8, 5, 7, 1, 3, 4, 2, 6};

        Sorting(arr);
        for( int i: arr){
            System.out.print(i);
        }
    }

    public static void Sorting(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j] > arr[j+1] ){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}