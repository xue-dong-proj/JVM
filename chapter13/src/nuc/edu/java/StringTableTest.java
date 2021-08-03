package nuc.edu.java;

/**
 * @author 薛东
 * @date 2021/5/26 15:55
 *
 * 在jdk1.6中，StringTable的默认大小为：1009
 * 最小的默认设置大小不限制
 * 在jdk1.8中,StringTable的默认大小为：60013
 * 最小的默认设置大小为1009
 */
public class StringTableTest {
    public static void main(String[] args) {
        System.out.println("Hello World");
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
