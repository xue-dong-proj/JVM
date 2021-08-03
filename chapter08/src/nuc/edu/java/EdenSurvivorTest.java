package nuc.edu.java;

/**
 * @author 薛东
 * @date 2021/5/14 19:53
 *
 * -Xms600m -Xmx600m
 *
 * -XX:NewRatio : 设置新生代与老年代的比例，默认为1:2
 * -XX:SurvivorRatio : 设置新生代中Eden区与Survivor区的比例，默认值是8
 * -XX:-UseAdaptiveSizePolicy : 关闭自适应的内存分配策略
 * -Xmn:设置新生代的空间大小
 */
public class EdenSurvivorTest {
    public static void main(String[] args) {
        System.out.println("Hello");
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
