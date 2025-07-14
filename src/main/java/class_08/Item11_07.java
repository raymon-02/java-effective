package class_08;


public class Item11_07 {

    private E e;
//    private volatile E e;

    public static void main(String[] args) throws InterruptedException {
        Item11_07 item = new Item11_07();

        Thread thread1 = new Thread(item::createE);
        Thread thread2 = new Thread(item::checkE);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }

    public void createE() {
        e = new E();
    }

    public void checkE() {
        E local = e;
        if (local != null) {
            System.out.println(local.i);
        }
    }
}
