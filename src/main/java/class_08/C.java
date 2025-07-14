package class_08;

public class C {
    private int i;
    private volatile int j;
    private volatile int h;

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

    public void setJ(int j) {
        this.j = j;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }
}
