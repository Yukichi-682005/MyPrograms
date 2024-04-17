class PrimeNumbers {
    boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    void print() {
        for (int i = 1; i <= 1000; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
}

public class PrimeNumBetween {
    public static void main(String[] args) {
        PrimeNumbers primeNumbers = new PrimeNumbers();
        System.out.println("All the prime numbers between 1 to 1000 are:");
        primeNumbers.print();
    }
}
