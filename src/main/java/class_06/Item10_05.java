package class_06;

public class Item10_05 {

    public static void main(String[] args) {
        try {
            throw new IllegalArgumentException();
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }
}

