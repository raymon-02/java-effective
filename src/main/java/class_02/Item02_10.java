package class_02;

public class Item02_10 {

    public static void main(String[] args) {
        boolean b = false;
        var result = b ? 42 : b ? 42 : null;
        System.out.println(result);
    }
}