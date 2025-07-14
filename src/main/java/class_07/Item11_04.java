package class_07;

public class Item11_04 {

    private A global = new A();

    public static void main(String[] args) throws InterruptedException {
        Item11_04 item = new Item11_04();

        Thread thread1 = new Thread(item::method1);
        Thread thread2 = new Thread(item::method2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }

    public void method1() {
        A a = new A();
        a.i = 5;
        int i = a.i;
        global = a;
        System.out.println(i);
    }

    public void method2() {
        global.i = 10;
    }
}
