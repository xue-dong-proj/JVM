package nuc.edu.java2;

/**
 * @author 薛东
 * @date 2021/5/27 15:18
 *
 * String垃圾回收机制
 *-Xms15m -Xmx15m -XX:+PrintStringTableStatistics -XX:+PrintGCDetails
 */
public class StringGCTest {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            String.valueOf(i).intern();
        }
    }
}
