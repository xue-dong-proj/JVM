package nuc.edu.java;

/**
 * @author 薛东
 * @date 2021/5/29 20:36
 *
 * -XX:+PrintGCDetails
 */
public class LocalVarGC {
    public static void main(String[] args) {
        LocalVarGC localVarGC = new LocalVarGC();
        localVarGC.localVarGC04();
    }

    public void localVarGC01(){
        /**
         * [GC (System.gc()) [PSYoungGen: 15487K->10744K(76288K)] 15487K->10944K(251392K), 0.0269082 secs]
         * [Full GC (System.gc()) [PSYoungGen: 10744K->0K(76288K)]
         * [ParOldGen: 200K->10876K(175104K)] 10944K->10876K(251392K),
         * [Metaspace: 3476K->3476K(1056768K)], 0.0045595 secs]
         *
         * GC之后，不会回收，PSYoungGen: 15487K->10744K
         * Full GC之后，由新生代到老年代
         */
        byte[] buffer = new byte[10 * 1024 * 1024];
        System.gc();
    }

    public void localVarGC02(){
        /**
         * [GC (System.gc()) [PSYoungGen: 15487K->808K(76288K)] 15487K->816K(251392K), 0.0008375 secs]
         * [Full GC (System.gc()) [PSYoungGen: 808K->0K(76288K)]
         * [ParOldGen: 8K->661K(175104K)] 816K->661K(251392K),
         * [Metaspace: 3488K->3488K(1056768K)], 0.0044319 secs]
         *
         * buffer引用地址置为空
         * 所以实际上为不可达
         * 所以GC的时候将它回收
         */
        byte[] buffer = new byte[10 * 1024 * 1024];
        buffer = null;
        System.gc();
    }

    public void localVarGC03(){
        /**
         * [GC (System.gc()) [PSYoungGen: 15487K->10728K(76288K)] 15487K->10988K(251392K), 0.0061411 secs]
         * [Full GC (System.gc()) [PSYoungGen: 10728K->0K(76288K)]
         * [ParOldGen: 260K->10901K(175104K)] 10988K->10901K(251392K),
         * [Metaspace: 3488K->3488K(1056768K)], 0.0065769 secs]
         *
         * GC之后没有被回收，因为它虽然是一个局部的代码块，在大括号以外虽然没有地方继续使用
         * 但是去一直存在他的索引地址
         * 所以不会被回收
         */
        {
            byte[] buffer = new byte[10 * 1024 * 1024];
        }
        System.gc();
    }

    public void localVarGC04(){
        /**
         * [GC (System.gc()) [PSYoungGen: 15487K->904K(76288K)] 15487K->912K(251392K), 0.0011765 secs]
         * [Full GC (System.gc()) [PSYoungGen: 904K->0K(76288K)]
         * [ParOldGen: 8K->661K(175104K)] 912K->661K(251392K),
         * [Metaspace: 3489K->3489K(1056768K)], 0.0046995 secs]
         *
         * 该buffer对象最后被回收，因为value占用了buffer的索引地址
         */
        {
            byte[] buffer = new byte[10 * 1024 * 1024];
        }
        int value = 10;
        System.gc();
    }

    public void localVarGC05(){
        localVarGC01();
        System.gc();
    }

}
