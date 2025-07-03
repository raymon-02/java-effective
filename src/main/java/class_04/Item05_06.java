package class_04;

import java.util.ArrayList;
import java.util.List;

public class Item05_06 {

    public static void main(String[] args) {
        List<Object> objs = new ArrayList<>();
        List<Integer> ints = new ArrayList<>();
        List<Number> numbers = new ArrayList<>();

        method(numbers);
//        method(ints);
//        method(objs);

        methodE(numbers);
        methodE(ints);
//        methodE(objs);

        methodS(numbers);
//        methodS(ints);
        methodS(objs);

        methodW(numbers);
        methodW(ints);
        methodW(objs);
    }

    private static void method(List<Number> list) {
    }

    private static void methodE(List<? extends Number> list) {
    }

    private static void methodS(List<? super Number> list) {
    }

    private static void methodW(List<?> list) {
    }
}