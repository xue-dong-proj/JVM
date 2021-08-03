package nuc.edu;

import java.nio.ByteBuffer;
import java.util.ArrayList;

/**
 * @author 薛东
 * @date 2021/5/21 16:27
 */
public class BufferTest {
    private static final int BUFFER = 1024 * 1024 * 20;

    public static void main(String[] args) {
        ArrayList<ByteBuffer> list = new ArrayList<>();

        int count = 0;
        try {
            while (true){
                ByteBuffer byteBuffer = ByteBuffer.allocateDirect(BUFFER);
                list.add(byteBuffer);
                count++;
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } finally {
            System.out.println(count);
        }
    }
}
