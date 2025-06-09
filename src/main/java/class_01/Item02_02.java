package class_01;

public class Item02_02 {

    public static void main(String[] args) {
        A a = new A();
        changeString(a);
        System.out.println(a.s);
    }

    private static void changeString(A a) {
        a.s += "!";
    }
}