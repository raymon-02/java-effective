package class_01;

public class Item02_01 {

    public static void main(String[] args) {
        String s = "Hello";
        changeString(s);
        System.out.println(s);
    }

    private static void changeString(String s) {
        s += "!";
    }
}
