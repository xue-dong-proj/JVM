package nuc.edu.java;

/**
 * @author 薛东
 * @date 2021/5/29 10:42
 */
public class SystemGCTest {
    public static void main(String[] args) {
        new SystemGCTest();
        System.gc();
        //System.runFinalization();
        String s = new String();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("SystemGCTest 重写了finalize()");
    }
}
