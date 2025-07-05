package class_05;

import java.util.function.Supplier;

public class Item07_02 {

    private String string;

    public static void main(String[] args) {
        Item07_02 item = new Item07_02();

        item.string = "small1";
        Supplier<String> sup1 = item.string::toUpperCase;
        Supplier<String> sup2 = () -> item.string.toUpperCase();

        item.string = "small2";
        System.out.println(sup1.get());
        System.out.println(sup2.get());
    }
}

