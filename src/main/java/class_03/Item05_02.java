package class_03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Item05_02 {

    public static void main(String[] args) {
        List<Object> objs = new ArrayList<>();
        List<Integer> ints = new ArrayList<>();
        List<Number> numbers = new ArrayList<>();

//        numbers = ints;
//        objs = ints;

        Collection<Integer> cInts = new ArrayList<>();
        cInts = ints;

        Collection<Number> cNumbers = new ArrayList<>();
//        cNumbers = ints;
    }
}
