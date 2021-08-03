package nuc.edu.java;

/**
 * @author 薛东
 * @date 2021/5/14 16:21
 *
 * -Xms10m -Xmx10m -XX:+PrintGCDetails
 *
 * jdk7及以前：堆内存逻辑上分为：新生代，老年区，永生代
 * jdk8及以后，堆内存逻辑上分为：新生代，老年区，元空间
 *
 * -Xms 用来设置堆空间（新生代，老年代）的起始内存大小
 *      -X 是Jvm的运行参数
 *      ms 是memory start
 *-Xms 用来设置堆空间（新生代，老年代）的最大内存大小
 */
public class SimpleHeap {
    private int id;

    public SimpleHeap(int id){
        this.id = id;
    }

    public void show(){
        System.out.println("My ID is" + id);
    }

    public static void main(String[] args) {
        SimpleHeap s1 = new SimpleHeap(1);
        SimpleHeap s2 = new SimpleHeap(2);
        int[] arr = new int[10];
        Object[] arr1 = new Object[10];
    }
}
