package class_07;

public class Item11_06 {

    private volatile C c = new C();

    public static void main(String[] args) throws InterruptedException {
        Item11_06 item = new Item11_06();

        Thread thread1 = new Thread(() -> item.c.setI(1));
        Thread thread2 = new Thread(() -> System.out.println(item.c.getI()));
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        Thread thread3 = new Thread(() -> item.c.setJ(2));
        Thread thread4 = new Thread(() -> System.out.println(item.c.getJ()));
        thread3.start();
        thread4.start();
        thread3.join();
        thread4.join();
    }
}
