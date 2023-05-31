package HomeWork_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class AllTasks {
    public ArrayList<Integer> generateIntList(int size, int bound) {
        ArrayList <Integer> array = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array.add(random.nextInt(bound));
        }

        return array;
    }
    public int getMinNumber(ArrayList<Integer> array) {
        return Collections.min(array);
    }

    public int getMaxNumber(ArrayList<Integer> array) {
        return Collections.max(array);
    }

    public int getAverage(ArrayList<Integer> array) {
        if (array.isEmpty()) {
            return 0;
        }

        int sum = 0;
        for (int number : array) {
            sum += number;
        }

        return sum / array.size();
    }

    public ArrayList<Integer> removeEvenNumbers(ArrayList<Integer> array) {
        ArrayList <Integer> newArray = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) % 2 != 0) {
                newArray.add(array.get(i));
            }
        }

        return newArray;
    }
}
