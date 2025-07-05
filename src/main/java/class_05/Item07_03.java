package class_05;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Item07_03 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        int i = 0;
//        list.forEach(el -> i += el);
        System.out.println(i);

        AtomicInteger ai = new AtomicInteger(0);
        list.forEach(ai::addAndGet);
        System.out.println(ai.get());
    }
}

