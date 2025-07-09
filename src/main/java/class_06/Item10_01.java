package class_06;

public class Item10_01 {

    public static void main(String[] args) {
//        try {
//            System.out.println("usage");
//            throw new E<Integer>();
//        } catch (E<Integer> e) {
//            throw new RuntimeException(e);
//        }

        try {
            System.out.println("usage");
            throw new E();
        } catch (E e) {
            throw new RuntimeException(e);
        }
    }
}

