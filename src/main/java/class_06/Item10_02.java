package class_06;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Item10_02 {

    public static void main(String[] args) {
        try (InputStream is = new FileInputStream("")) {
            System.out.println("usage");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

