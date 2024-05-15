public class RecursiveFibonacci {

    public static int printFibonacci(int range){
        if(range <= 1) return range;
        return printFibonacci(range - 1) + printFibonacci(range - 2);
    }
    public static void main(String[] args){
        int length = 6;
        for(int i=1; i<=length; i++){
            System.out.print(printFibonacci(i) + " ");
        }
    }
}
