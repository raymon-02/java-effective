package class_03;

public class A extends AbstractA implements IA, IB {

    @Override
    public String method(int i) {
        return "";
    }

    @Override
    public String method2(int i) {
        return "";
    }

    @Override
    public String method3(int i) {
        return IA.super.method3(i);
    }

    @Override
    public String method4(int i) {
        return "";
    }
}
