package class_08;

public class D {
    public final int id;
    private int i;

    public D(int id) {
        this.id = id;
    }

    public int add(int i) {
        return this.i += i;
    }

    public void sub(int i) {
        this.i -= i;
    }
}
