package nuc.edu.java1;

/**
 * @author 薛东
 * @date 2021/5/20 14:27
 *
 * jdk8以上 ：-Xms200m -Xmx200m -XX:MetaspaceSize=300m -XX:MaxMetaspaceSize=300m -XX:+PrintGCDetails
 * ParOldGen       total 136704K, used 102400K
 * byte数组分配到老年代
 *
 * jdk7以下
 *-Xms200m -Xmx200m -XX:PermSize=300m -XX:MaxPermSize=300m -XX:+PrintGCDetails
 *
 */
public class StaticMethodAreaTest {
    public static void main(String[] args) {
        byte[] bytes = new byte[1024 *1024 * 100];
        System.out.println("......");
        /*try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
    }
}
