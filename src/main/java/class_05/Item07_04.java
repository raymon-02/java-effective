package class_05;

import java.util.ArrayList;
import java.util.List;

public class Item07_04 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        list.stream()
                .peek(System.out::println)
                .map(el -> el + 5)
                .forEach(System.out::println);
    }
}

