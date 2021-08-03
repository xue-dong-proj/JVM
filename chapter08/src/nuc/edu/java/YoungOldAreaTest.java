package nuc.edu.java;

/**
 * @author 薛东
 * @date 2021/5/15 20:34
 *
 * 测试：大对象直接进入老年代
 * -Xms60m -Xmx60m -XX:NewRatio=2 -XX:SurvivorRatio=8 -XX:+PrintGCDetails
 * 其实堆内存为60m，最大堆内存的大小为60m
 * 新生代的内存与老年代的内存大小比为 1:2
 * 新生代中Eden区与Survivor0区和Survivor1区内存大小的的比例为8:1:1
 * 老年代的内存大小40m，新生代的内存大小20m
 * 新生代中Eden区的内存大小16m，Survivor0区的内存大小2m，Survivor1区的内存大小为2m
 * 因为数组byte[] 的大小为20m，大于新生代Eden的内存大小
 *
 * 所以新创建的byte[]数组直接进入老年代
 *
 * PSYoungGen      total 18432K, used 2642K
 * ParOldGen       total 40960K, used 20480K
 */
public class YoungOldAreaTest {
    public static void main(String[] args) {
        byte[] buffer = new byte[1024 * 1024 * 20];   // 20m
    }
}
