public class LinearSearch {
    public static void main(String [] args){
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int element = 6;
        boolean found = false;

        for(int i=0; i<arr.length; i++){
            if(arr[i] == element){
                System.out.println("The element is found at index "+ i);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("The element is not present in the array");
        }
    }
}
