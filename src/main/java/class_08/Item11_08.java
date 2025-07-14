package class_08;

public class Item11_08 {

    private volatile C c = new C();

    public static void main(String[] args) throws InterruptedException {
        Item11_08 item = new Item11_08();

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

        Thread thread5 = new Thread(() -> item.c.setH(2));
        Thread thread6 = new Thread(() -> System.out.println(item.c.getH()));
        thread5.start();
        thread6.start();
        thread5.join();
        thread6.join();
    }
}
