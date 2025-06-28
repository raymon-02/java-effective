package class_03;

import java.util.ArrayList;
import java.util.List;

public class Item05_03 {

    public static void main(String[] args) {
        List<Object> objs = new ArrayList<>();
        List<Integer> ints = new ArrayList<>();
        List<Number> numbers = new ArrayList<>();
        List<? extends Number> eNumbers = new ArrayList<>();

        eNumbers = numbers;
        eNumbers = ints;
//        eNumbers = objs;

//        eNumbers.add(5);
        eNumbers.add(null);
        Number number = eNumbers.get(0);
    }
}
