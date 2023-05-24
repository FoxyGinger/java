package HomeWork_1;

public class Task1 {
    public int getTriangleNumber(int index) {
        int result = 0;
        for (int i = 1; i <= index; ++i) {
            result += i;
        }

        return result;
    }
}
