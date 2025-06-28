package class_03;

import java.util.ArrayList;
import java.util.List;

public class Item05_04 {

    public static void main(String[] args) {
        List<Object> objs = new ArrayList<>();
        List<Integer> ints = new ArrayList<>();
        List<Number> numbers = new ArrayList<>();
        List<? super Number> sNumbers = new ArrayList<>();

        sNumbers = numbers;
//        sNumbers = ints;
        sNumbers = objs;

        sNumbers.add(5);
        sNumbers.add(2.0);
        sNumbers.add(null);
//        sNumbers.add(new Object());
        Object o = sNumbers.get(0);
    }
}
