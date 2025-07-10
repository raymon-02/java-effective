package class_06;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class Item10_03 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        method(() -> Files.write(Paths.get(""), list));
//        method(() -> { Files.write(Paths.get(""), list); });
    }

    private static void method(Runnable runnable) {
        System.out.println("Runnable");
    }

    private static <V> void method(Callable<V> callable) {
        System.out.println("Callable");
    }
}

