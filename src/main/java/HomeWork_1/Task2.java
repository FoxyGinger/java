package HomeWork_1;

public class Task2 {
    public int getFactorial(int number) {
        int result = 1;
        for (int i = 2; i <= number; ++i) {
            result *= i;
        }

        return result;
    }
}
