public class SeperateOddEven {
    public static void main(String [] args){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int CountEven = 0;
        int CountOdd = 0;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2 == 0){
                CountEven++;
            }else{
                CountOdd++;
            }
        }
        int[] even = new int[CountEven];
        int[] odd = new int[CountOdd];

        int EvenIndex = 0;
        int OddIndex = 0;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2 == 0){
                even[EvenIndex++] = arr[i];
            }else{
                odd[OddIndex++] = arr[i];
            }
        }
        System.out.println("Even numbers:");
        for(int i = 0; i < even.length; i++) {
            System.out.println(even[i]);
        }

        System.out.println("Odd numbers:");
        for(int i = 0; i < odd.length; i++) {
            System.out.println(odd[i]);
        }
    }
}
