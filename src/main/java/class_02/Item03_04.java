package class_02;

import java.util.HashMap;
import java.util.Map;

public class Item03_04 {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("1", 1);
        map.put("2", null);

        Integer i1 = map.get("1");
        if (i1 != null) {
            System.out.println(i1);
        }

        Integer i2 = map.get("2");
        if (i2 != null) {
            System.out.println(i2);
        }

        Integer i3 = map.get("3");
        if (i3 != null) {
            System.out.println(i3);
        }
    }
}
