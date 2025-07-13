package class_07;

public class Item11_03 {

    private A a;
//    private volatile A a;

    private B b;
//    private volatile B b;

    public static void main(String[] args) throws InterruptedException {
        Item11_03 item = new Item11_03();

        Thread thread1 = new Thread(item::createA);
        Thread thread2 = new Thread(item::checkA1);
        Thread thread3 = new Thread(item::checkA2);
        thread1.start();
        thread2.start();
        thread3.start();
        thread1.join();
        thread2.join();
        thread3.join();

        Thread thread4 = new Thread(item::createB);
        Thread thread5 = new Thread(item::checkB1);
        thread4.start();
        thread5.start();
        thread5.join();
    }

    public void createA() {
        a = new A();
    }

    public void createB() {
        b = new B();
    }

    public void checkA1() {
        if (a != null) {
            System.out.println(a.i);
        }
    }

    public void checkA2() {
        A local = a;
        if (local != null) {
            System.out.println(local.i);
        }
    }

    public void checkB1() {
        B local = b;
        if (local != null) {
            System.out.println(local.i);
        }
    }
}
