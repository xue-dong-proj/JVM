package nuc.edu.java;

/**
 * @author 薛东
 * @date 2021/5/16 10:57
 *
 * 测试-XX:UseTLAB参数是否开启的情况 ： 默认情况下是开启的
 * -XX:+UseTLAB
 */
public class TLABArgsTest {
    public static void main(String[] args) {
        System.out.println("Hello");
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
