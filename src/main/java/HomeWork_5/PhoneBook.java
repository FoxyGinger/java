package HomeWork_5;

import java.util.*;

public class PhoneBook {
    HashMap<String, ArrayList<String>> pb;

    public PhoneBook() {
        pb = new HashMap<>();
    }

    public void add(String name, String phone) {
        ArrayList<String> phones = pb.get(name);
        if(phones == null) {
            phones = new ArrayList<>();
            phones.add(phone);
            pb.put(name, phones);
        } else {
            if(pb.containsKey(name)) phones.add(phone);
        }
    }

    public void print() {
        Set<HashMap.Entry<String, ArrayList<String>>> entries = pb.entrySet();
        Comparator<HashMap.Entry<String, ArrayList<String>>> valueComparator = (lhs, rhs) -> {
            Integer v1 = lhs.getValue().size();
            Integer v2 = rhs.getValue().size();
            return v1.compareTo(v2);
        };

        List<HashMap.Entry<String, ArrayList<String>>> listOfEntries = new ArrayList<>(entries);
        Collections.sort(listOfEntries, valueComparator.reversed());

        for(HashMap.Entry<String, ArrayList<String>> entry : listOfEntries) {
            System.out.println(entry.getKey() + ": " + entry.getValue().toString());
        }
    }
}
