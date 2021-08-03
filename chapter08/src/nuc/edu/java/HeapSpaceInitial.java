package nuc.edu.java;

/**
 * @author 薛东
 * @date 2021/5/14 17:10
 *
 *1. -Xms 用来设置堆空间（新生代，老年代）的起始内存大小
 *      -X 是Jvm的运行参数
 *      ms 是memory start
 *-Xms 用来设置堆空间（新生代，老年代）的最大内存大小
 *
 * 2.设置堆空间的大小
 *      初始内存大小：物理电脑内存大小 / 64
 *      最大内存大小：物理电脑内存大小 / 4
 *
 * 3. 手动设置： -Xms600m -Xmx600m
 *      开发中建议将初始堆内存和最大的堆内存设置成相同的值
 *
 * 4. 查看设置的参数；
 *      方式一： jps    jstat -gc 进程id
 *      方式二： -XX:+PrintGCDetails
 */
public class HeapSpaceInitial {
    public static void main(String[] args) {
        long initialMemory = Runtime.getRuntime().totalMemory() / 1024 / 1024;
        long maxMemory = Runtime.getRuntime().maxMemory() / 1024 / 1024;

        System.out.println("-Xms : " + initialMemory + "M");
        System.out.println("-Xmx : " + maxMemory + "M");

        /*System.out.println("系统内存大小为：" + initialMemory * 64.0 / 1024 + "G");
        System.out.println("系统内存大小为：" + maxMemory * 4.0 / 1024 + "G");*/

       /* try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
    }
}
