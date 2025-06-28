package class_03;

public interface IA {

    String method(int i);

    default String method2(int i) {
        return i + "!";
    }

    default String method3(int i) {
        return i + "!";
    }

    String method4(int i);

    String method5(int i);

    default String method6(int i) {
        return i + "!";
    }

    default String method7(int i) {
        return i + "!";
    }
}
