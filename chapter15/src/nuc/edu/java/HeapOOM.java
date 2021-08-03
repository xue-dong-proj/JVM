package nuc.edu.java;

import java.util.ArrayList;

/**
 * @author 薛东
 * @date 2021/5/28 16:52
 *
 * -Xms8m -Xmx8m -XX:+HeapDumpOnOutOfMemoryError
 */
public class HeapOOM {
    byte[] buffer = new byte[1 * 1024 * 1024];
    public static void main(String[] args) {
        ArrayList<HeapOOM> list = new ArrayList<>();

        int count = 0;

        try {
            while (true){
                list.add(new HeapOOM());
                count++;
            }
        } catch (Throwable e) {
            System.out.println("count = " + count);
            e.printStackTrace();
        }
    }
}
