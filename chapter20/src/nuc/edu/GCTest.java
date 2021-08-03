package nuc.edu;

import java.io.OutputStream;
import java.util.ArrayList;

/**
 * @author 薛东
 * @date 2021/6/8 9:41
 */
public class GCTest {
    public static void main(String[] args) {
        ArrayList<byte[]> list = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            byte[] bytes = new byte[100 * 1024];
            list.add(bytes);
            try {
                Thread.sleep(60);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
