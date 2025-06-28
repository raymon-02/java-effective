package class_03;

import java.lang.ref.WeakReference;

public class Item05_01 {

    public static void main(String[] args) {
        WeakReference<Long> wr = new WeakReference<>(5L);
        System.out.println(wr.get());
        System.gc();
        System.out.println(wr.get());


        WeakReference<Long> wr2 = new WeakReference<>(150L);
        System.out.println(wr2.get());
        System.gc();
        System.out.println(wr2.get());
    }
}
