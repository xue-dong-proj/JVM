package nuc.edu.java;

/**
 * @author 薛东
 * @date 2021/5/28 14:41
 */
public class RefCountGC {
    private byte[] bigSize = new byte[5 * 1024 * 1024];
    Object reference = null;

    public static void main(String[] args) {
        RefCountGC obj1 = new RefCountGC();
        RefCountGC obj2 = new RefCountGC();
        obj1.reference = obj2;
        obj2.reference = obj1;

        obj1 = null;
        obj2 = null;

        /**
         * Heap
         *  PSYoungGen      total 76288K, used 16798K [0x000000076b500000, 0x0000000770a00000, 0x00000007c0000000)
         *   eden space 65536K, 25% used [0x000000076b500000,0x000000076c567a78,0x000000076f500000)
         *
         * 没有进行GC,eden区占用25%
         */
        //System.gc();

        /**
         * [GC (System.gc()) [PSYoungGen: 15487K->840K(76288K)] 15487K->848K(251392K), 0.0009436 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
         * [Full GC (System.gc()) [PSYoungGen: 840K->0K(76288K)] [ParOldGen: 8K->660K(175104K)] 848K->660K(251392K), [Metaspace: 3487K->3487K(1056768K)], 0.0042328 secs] [Times: user=0.16 sys=0.00, real=0.01 secs]
         * Heap
         *  PSYoungGen      total 76288K, used 655K [0x000000076b500000, 0x0000000770a00000, 0x00000007c0000000)
         *   eden space 65536K, 1% used [0x000000076b500000,0x000000076b5a3ee8,0x000000076f500000)
         *
         *   进行了gc,空间被回收
         *
         *   说明java不用引用计数器回收算法
         */
        System.gc();

        try {
            Thread.sleep(10000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
