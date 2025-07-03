package class_04;

import java.util.ArrayList;
import java.util.List;

public class Item05_05 {

    public static void main(String[] args) {
        List<Object> objs = new ArrayList<>();
        List<Integer> ints = new ArrayList<>();
        List<Number> numbers = new ArrayList<>();
        List<?> wNumbers = new ArrayList<>();
        List<?> wIntegers = new ArrayList<>();

        wNumbers = numbers;
        wNumbers = ints;
        wNumbers = objs;
        wNumbers = wIntegers;
        wIntegers = wNumbers;

//        wNumbers.add(5);
        wNumbers.add(null);
        Object number = wNumbers.get(0);
    }
}