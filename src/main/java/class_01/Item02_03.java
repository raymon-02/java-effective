package class_01;

public class Item02_03 {

    public static void main(String[] args) {
        A a = new A();
        changeObject(a);
        System.out.println(a.s);
    }

    private static void changeObject(A a) {
        a = new A();
        a.s += "!";
    }
}
