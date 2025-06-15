package class_02;

import java.util.Objects;

public class B {

    public int i = 0;

    @Override
    public int hashCode() {
        return Objects.hashCode(i);
    }

    //    @Override
    public boolean equals(B b) {
        return i == b.i;
    }
}
