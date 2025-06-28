package class_02;

import java.util.HashMap;
import java.util.Map;

public class Item03_03 {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("1", 1);

        System.out.println(map.containsKey("1"));
        System.out.println(map.containsKey(null));

        map.put(null, 2);
        System.out.println(map.containsKey("1"));
        System.out.println(map.containsKey(null));
    }
}
