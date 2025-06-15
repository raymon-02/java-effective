package class_02;

import java.util.HashSet;
import java.util.Set;

public class Item03_03 {

    public static void main(String[] args) {
        Set<A> set = new HashSet<>();
        A a = new A();
        set.add(a);
        System.out.println(set.contains(a));

        A copy = new A();
        System.out.println(set.contains(copy));

        a.i = 20;
        System.out.println(set.contains(a));


        for (int i = 1; i < 17; i++) {
            a.i = i;
            if (set.contains(a)) {
                System.out.println("i=" + i);
            }
        }
    }
}
