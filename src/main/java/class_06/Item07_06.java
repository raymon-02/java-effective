package class_06;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Item07_06 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        AtomicInteger ai = new AtomicInteger(0);
//        list.forEach(el -> ai.addAndGet(el));
        ai = new AtomicInteger(1);
        System.out.println(ai.get());

        AtomicInteger ai2 = new AtomicInteger(0);
        list.forEach(ai2::addAndGet);
        ai2 = new AtomicInteger(1);
        System.out.println(ai2.get());
    }
}

