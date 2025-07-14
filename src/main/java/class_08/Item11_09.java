package class_08;

public class Item11_09 {

    public static void main(String[] args) throws InterruptedException {
        Item11_09 item = new Item11_09();

        D d1 = new D(1);
        D d2 = new D(2);

        Thread thread1 = new Thread(() -> item.method(d1, d2, 10));
        Thread thread2 = new Thread(() -> item.method(d2, d1, 10));
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        Thread thread3 = new Thread(() -> item.method2(d1, d2, 10));
        Thread thread4 = new Thread(() -> item.method2(d2, d1, 10));
        thread3.start();
        thread4.start();
        thread3.join();
        thread4.join();
    }

    public void method(D d1, D d2, int i) {
        System.out.println("Start method");
        synchronized (d1) {
            synchronized (d2) {
                d1.sub(i);
                d2.add(i);
            }
        }
        System.out.println("Finished method");
    }

    public void method2(D d1, D d2, int i) {
        System.out.println("Start method2");
        D ds1 = d1;
        D ds2 = d2;
        if (d1.id <= d2.id) {
            synchronized (ds1) {
                synchronized (ds2) {
                    ds1.sub(i);
                    ds2.add(i);
                }
            }
        } else {
            ds1 = d2;
            ds2 = d1;
            synchronized (ds1) {
                synchronized (ds2) {
                    ds2.sub(i);
                    ds1.add(i);
                }
            }
        }
        System.out.println("Finished method2");
    }
}
