import HomeWork_5.PhoneBook;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        PhoneBook pb = new PhoneBook();
        pb.add("Курт", "89213111116");
        pb.add("Вуди", "89211111111");
        pb.add("Вуди", "89211111112");
        pb.add("Вуди", "89211111113");
        pb.add("Джонни", "89212111114");
        pb.add("Джонни", "89212111115");
        pb.add("Линда", "89214111117");
        pb.add("Линда", "89214111118");
        pb.add("Линда", "89214111119");
        pb.add("Линда", "89214111110");
        pb.print();
    }
}