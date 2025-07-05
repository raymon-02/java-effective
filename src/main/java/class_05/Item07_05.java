package class_05;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Item07_05 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Stream<Integer> stream = list.stream();
        list.add(4);

        stream.forEach(System.out::println);
    }
}

