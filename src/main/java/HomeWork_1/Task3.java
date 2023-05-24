package HomeWork_1;

public class Task3 {
    public boolean isPrime(int number) {
        int lastNumber = number / 2;
        for (int i = 2; i <= lastNumber; ++i) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public void printPrimeNumbers(int border) {
        if (border <= 0) {
            return;
        }

        for (int i = 1; i <= border; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
}
