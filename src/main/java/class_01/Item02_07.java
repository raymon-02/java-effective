package class_01;

public class Item02_07 {

    public static void main(String[] args) {
        method(5);
        method(Integer.valueOf(5));
        method(5L);
        method(Long.valueOf(5));

        Long l = 1L;
        test(1L);
        test(l);
    }

    public static Object method(int i) {
        System.out.println("int");
        return null;
    }

    public static Object method(Integer i) {
        System.out.println("Integer");
        return null;
    }

    public static Object method(long i) {
        System.out.println("long");
        return null;
    }

    public static Object method(Long i) {
        System.out.println("Long");
        return null;
    }

//    public void method(int i) {
//        System.out.println("void");
//    }

//    public Long method(int i) {
//        return 1L;
//    }


    public static void test(long l) {
        System.out.println(l);
    }

    public static void test(Long l) {
        throw new IllegalArgumentException();
    }
}