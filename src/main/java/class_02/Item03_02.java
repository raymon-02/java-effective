package class_02;

import java.util.HashSet;
import java.util.Set;

public class Item03_02 {

    public static void main(String[] args) {
        Set<B> set = new HashSet<>();
        B b = new B();
        set.add(b);

        B copy = new B();
        System.out.println(set.contains(copy));
    }
}
