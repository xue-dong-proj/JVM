package nuc.edu.java1;

/**
 * @author 薛东
 * @date 2021/5/30 10:11
 *
 *  强引用不回收
 */
public class StrongReferenceTest {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Hello World");
        StringBuffer str1 = str;

        str = null;
        System.gc();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(str1);
    }
}
