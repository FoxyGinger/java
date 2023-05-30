import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Long before = System.currentTimeMillis();
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < 10000000; i++) {
            array.add(i);
        }
        Long after = System.currentTimeMillis();
        System.out.println(after - before);
//        System.out.println(array);
        Long before1 = System.currentTimeMillis();
        LinkedList<Integer> linkarray = new LinkedList<>();
        for (int i = 0; i < 10000000; i++) {
            linkarray.add(i);
        }
        Long after1 = System.currentTimeMillis();
//        System.out.println(linkarray);
        System.out.println(after1 - before1);
    }
}