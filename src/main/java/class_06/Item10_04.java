package class_06;

public class Item10_04 {

    public static void main(String[] args) {
        int i1 = method();
        System.out.println(i1);

        int i2 = method2();
        System.out.println(i2);

        int i3 = method3();
        System.out.println(i3);

        int i4 = method4();
        System.out.println(i4);
    }

    private static int method() {
        try {
            return 1;
        } finally {
            return 2;
        }
    }

    private static int method2() {
        try {
            throw new Exception();
        } catch (Exception e) {
            return 1;
        } finally {
            return 2;
        }
    }

    private static int method3() {
        try {
            throw new Exception();
        } finally {
            return 2;
        }
    }

    private static int method4() {
        try {
            throw new Exception();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            return 2;
        }
    }
}

