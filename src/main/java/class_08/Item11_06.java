package class_08;

public class Item11_06 {

    private volatile int acc = 0;

    public static void main(String[] args) throws InterruptedException {
        Item11_06 item = new Item11_06();

        Thread thread1 = new Thread(item::method1);
        Thread thread2 = new Thread(item::method1);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(item.acc); // values? 2-200000
    }

    public void method1() {
        for (int i = 0; i < 100000; i++) {
            acc++;
        }
    }
}
