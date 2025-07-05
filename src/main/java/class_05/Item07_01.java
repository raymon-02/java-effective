package class_05;

public class Item07_01 {

    public static void main(String[] args) {
        A<Object> a1 = (Object o) -> "string".equals(o);
        A<Object> a2 = "string"::equals;

//        B b1 = (Object o) -> "string".equals(o);
        B b2 = "string"::equals; // = "string"::<Object>equals;
    }
}

