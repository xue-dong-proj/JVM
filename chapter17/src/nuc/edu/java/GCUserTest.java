package nuc.edu.java;

import java.util.ArrayList;

/**
 * @author 薛东
 * @date 2021/5/30 21:02
 *
 * -XX:+PrintCommandLineFlags
 */
public class GCUserTest {
    public static void main(String[] args) {
        //jdk 1.8中
        // -XX:+UseParallelGC
        // -XX:+UseParallelOldGC
        // 使用的是UseParallelGC

        //在jdk9中
        // -XX:+UseG1GC
        // 使用的是UseG1GC

        // -XX:+UseConcMarkSweepGC
        // -XX:+UseParNewGC
        ArrayList<byte[]> list = new ArrayList<>();
        while (true){
            byte[] bytes = new byte[100];
            list.add(bytes);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
