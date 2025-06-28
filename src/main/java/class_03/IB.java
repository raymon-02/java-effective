package class_03;

public interface IB {

    String method(int i);
//    void method(int i);

    default String method2(int i) {
        return "!" + i;
    }

    String method3(int i);
}
