package class_02;

import java.util.Objects;

public class A {

    public int i = 0;

    @Override
    public int hashCode() {
        return Objects.hashCode(i);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        A a = (A) o;
        return i == a.i;
//        return true;
    }
}
