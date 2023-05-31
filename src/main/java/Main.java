import HomeWork_3.AllTasks;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        AllTasks allTasks = new AllTasks();
        ArrayList<Integer> array = allTasks.generateIntList(10, 100);
        System.out.println(array.toString());
        System.out.printf("min: %d\n", allTasks.getMinNumber(array));
        System.out.printf("max: %d\n", allTasks.getMaxNumber(array));
        System.out.printf("average: %d\n", allTasks.getAverage(array));
        System.out.printf("removed all even number:\n%s\n", allTasks.removeEvenNumbers(array));
    }
}