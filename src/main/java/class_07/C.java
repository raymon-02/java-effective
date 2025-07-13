package class_07;

public class C {
    private int i;
    private volatile int j;

    public C() {
        this.i = 42;
    }

    public synchronized int getI() {
        return i;
    }

    public synchronized void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public synchronized void setJ(int j) {
        this.j = j;
    }
}
