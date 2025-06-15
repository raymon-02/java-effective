package class_02;

import java.util.Objects;

public class Item03_01 {

    public static void main(String[] args) {
        double a = 0.0;
        double b = -0.0;

        double c = Double.NaN;
        double d = Double.NaN;

        System.out.println(a == b);
        System.out.println(c == d);

        System.out.println(Objects.equals(a, b));
        System.out.println(Objects.equals(c, d));
    }
}
