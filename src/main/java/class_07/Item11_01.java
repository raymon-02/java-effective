package class_07;

public class Item11_01 {

    private boolean isRun = true;
//    private volatile boolean isRun = true;

    public static void main(String[] args) throws InterruptedException {
        Item11_01 item = new Item11_01();

        Thread thread1 = new Thread(item::run);
        Thread thread2 = new Thread(item::finish);

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }

    public void run() {
        while (isRun) {
            System.out.println("run");
        }
    }

    public void finish() {
        System.out.println("finish");
        isRun = false;
    }
}
