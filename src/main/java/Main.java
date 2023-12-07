import HomeWork_6.Brand;
import HomeWork_6.Colour;
import HomeWork_6.Laptop;
import HomeWork_6.LaptopFilter;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop(Brand.HP, Colour.RED);
        Laptop laptop2 = new Laptop(Brand.HP, Colour.BLUE);
        Laptop laptop3 = new Laptop(Brand.ASUS, Colour.BLUE);
        Laptop laptop4 = new Laptop(Brand.SONY, Colour.BLACK);
        Laptop laptop5 = new Laptop(Brand.LENOVO, Colour.RED);
        Laptop laptop6 = new Laptop(Brand.SAMSUNG, Colour.WHITE);
        Laptop laptop7 = new Laptop(Brand.SAMSUNG, Colour.BLUE);
        Laptop laptop8 = new Laptop(Brand.SAMSUNG, Colour.RED);
        Set<Laptop> laptops = new HashSet<>(Arrays.asList(laptop1, laptop2, laptop3, laptop4, laptop5,
                laptop6, laptop7, laptop8));

        LaptopFilter laptopFilter = new LaptopFilter(laptops);
        laptopFilter.inputFilter();
    }
}