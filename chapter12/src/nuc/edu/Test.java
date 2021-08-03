package nuc.edu;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 薛东
 * @date 2021/5/22 15:34
 */
public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            list.add("Hello");
            try {
                Thread.sleep(1000000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
