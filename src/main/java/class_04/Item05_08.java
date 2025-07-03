package class_04;

import java.util.ArrayList;
import java.util.List;

public class Item05_08 {

    public static void main(String[] args) {
        List<C> listC = new ArrayList<>();

//        Item05_08.<E>max(listE);
//        Item05_08.<E>max2(listE);
//        Item05_08.<E>max3(listE);
        C c = max4(listC);

        List<D> listD = new ArrayList<>();
        D d = max(listD);
        D d2 = max2(listD);
        D d3 = max3(listD);
        D d4 = max4(listD);
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

    private static <T extends Comparable<? extends T>> T max4(List<? extends T> list) {
        return list.getFirst();
    }
}

