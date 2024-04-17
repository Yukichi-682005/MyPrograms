public class Swap2 {
    public static void main(String [] args){
        int a = 10;
        int b = 20;
        System.out.println("The values of a and b before swapping are:"+ a + "and" + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("The values of a and b after swapping are:"+ a + "and" + b);
    }
}
