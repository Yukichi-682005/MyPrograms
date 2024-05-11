public class BinarySearch {
    public static void main(String [] args){
        int arr[] = {9, 3, 4, 5, 1, 2, 6, 7, 8};
        int target = 10;

        for(int i=1; i<arr.length; i++){
            int temp = arr[i];
            int j = i-1;
            while(j >=0 && arr[j] > temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
        int index = Searching(arr, target);
        if(index == -1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at index " + index);
        }
    }

    public static int Searching(int[] arr, int target) {
        int low = 0;
        int high = arr.length-1;
        while(low <= high){
            int middle = low+(high-low)/2;
            int value = arr[middle];
            
            if(value < target) low = middle+1;
            else if(value > target) high = middle-1;
            else return middle;
        }
        return -1;
    }
}
