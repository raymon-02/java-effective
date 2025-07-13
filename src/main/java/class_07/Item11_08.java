package class_07;

public class Item11_08 {

    private A a;
    private volatile A a1;
    private B b;

    public static void main(String[] args) {
        System.out.println("start");
        Item11_08 item = new Item11_08();
        A a = item.get();
    }

    public synchronized A get() {
        if (a == null) {
            a = new A();
        }
        return a;
    }

    public A getBrokenDCL() {
        if (a == null) {
            synchronized (this) {
                if (a == null) {
                    a = new A();
                }
            }
        }
        return a;
    }

    public A getStatic() {
        return Holder.instance;
    }

    public A getDCL() {
        if (a1 == null) {
            synchronized (this) {
                if (a1 == null) {
                    a1 = new A();
                }
            }
        }
        return a1;
    }

    public B getFinal() {
        B local = b;
        if (local == null) {
            synchronized (this) {
                local = b;
                if (local == null) {
                    local = new B();
                    b = local;
                }
            }
        }
        return local;
    }

    public A getBrokenOneRead() {
        A local = a;
        if (local == null) {
            synchronized (this) {
                local = a;
                if (local == null) {
                    local = new A();
                    a = local;
                }
            }
        }
        return local;
    }

    public A getOneRead() {
        A local = a1;
        if (local == null) {
            synchronized (this) {
                local = a1;
                if (local == null) {
                    local = new A();
                    a1 = local;
                }
            }
        }
        return local;
    }

    private static class Holder {
        public static final A instance = new A();

        static {
            System.out.println("init");
        }
    }
}
