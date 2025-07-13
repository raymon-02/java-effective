package class_07;

public class Item11_02 {

    private int i = 0;
    private boolean isRun = true; // 0, 41, 42, 43, cycle
//    private volatile boolean isRun = true; // 42, 43 AND volatile i -> 42, 43

    public static void main(String[] args) throws InterruptedException {
        Item11_02 item = new Item11_02();

        Thread thread1 = new Thread(item::method1);
        Thread thread2 = new Thread(item::method2);

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }

    public void method1() {
        i = 41;
        i = 42;
        isRun = false;
        i = 43;
    }

    public void method2() {
        while (isRun) {
        }
        System.out.println(i);
    }
}
