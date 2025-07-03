package class_04;

import java.util.ArrayList;
import java.util.List;

public class Item05_07 {

    public static void main(String[] args) {
        List<B> list = new ArrayList<>();

//        Item05_07.max(list);
//        Item05_07.<C>max(list);
//        Item05_07.<D>max(list);
        A a = max2(list); // <A>
        B b = max3(list); // <B>
        A a2 = Item05_07.<B>max3(list);
        A a3 = Item05_07.<A>max3(list);
    }

    private static <T extends Comparable<T>> T max(List<T> list) {
        return list.getFirst();
    }

    private static <T extends Comparable<T>> T max2(List<? extends T> list) {
        return list.getFirst();
    }

    private static <T extends Comparable<? super T>> T max3(List<? extends T> list) {
        return list.getFirst();
    }
}