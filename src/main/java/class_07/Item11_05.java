package class_07;

import java.util.concurrent.atomic.AtomicInteger;

public class Item11_05 {

    private volatile int acc = 0;
    private final AtomicInteger ai = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {
        Item11_05 item = new Item11_05();

        Thread thread1 = new Thread(item::method1);
        Thread thread2 = new Thread(item::method1);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(item.acc);

        Thread thread3 = new Thread(item::method2);
        Thread thread4 = new Thread(item::method2);
        thread3.start();
        thread4.start();
        thread3.join();
        thread4.join();
        System.out.println(item.ai.get());
    }

    public void method1() {
        for (int i = 0; i < 100000; i++) {
            acc++;
        }
    }

    public void method2() {
        for (int i = 0; i < 100000; i++) {
            ai.incrementAndGet();
        }
    }
}
