public class FrequencyOccurance {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 3, 4, 4, 5, 3, 2, 3, 9, 8};
        int target = 3;
        int count = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] == 3){
                count++;
            }
        }

        System.out.println("The element "+target+" has appeared "+count+" times in the array");
    }
}
