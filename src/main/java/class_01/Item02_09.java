package class_01;

public class Item02_09 {

    public static void main(String[] args) {
        method();
        method2();
        method3();
    }

    private static void method() {
        final var a = 2;
        final var b = 25;
        final var c = '1';
        final var result = true ? a * b : c;
        System.out.println(result);
    }

    private static void method2() {
        var a = 2;
        final var b = 25;
        final var c = '1';
        final var result = true ? a * b : c;
        System.out.println(result);
    }

    private static void method3() {
        final var a = 2;
        final var b = 25;
        final var c = "1";
        final var result = true ? a * b : c;
        System.out.println(result);
    }
}