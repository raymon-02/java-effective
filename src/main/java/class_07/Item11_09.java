package class_07;

import java.util.function.Supplier;

public class Item11_09 {

    private Supplier<A> supp;
    //    private volatile Supplier<A> supp;
    private A a;

    public static void main(String[] args) {
        Item11_09 item = new Item11_09();
        A a = item.get();
    }

    public A get() {
        if (supp != null) {
            synchronized (this) {
                if (a == null) {
                    a = supp.get();
                    supp = null;
                }
            }
        }
        return a;
    }
}
