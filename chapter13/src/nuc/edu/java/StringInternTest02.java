package nuc.edu.java;

/**
 * @author 薛东
 * @date 2021/5/27 14:53
 */
public class StringInternTest02 {
    static final int MAX_COUNT = 1000 * 10000;
    static final String[] arr = new String[MAX_COUNT];

    public static void main(String[] args) {
        Integer[] data = new Integer[]{1,2,3,4,5,6,7,8,9,10};

        long start = System.currentTimeMillis();
        for (int i = 0; i < MAX_COUNT; i++) {
            // 使用intern()方法可以节省内存空间
            // arr[i] = new String(String.valueOf(data[i % data.length]));  // 3087
            arr[i] = new String(String.valueOf(data[i % data.length])).intern(); // 1018
        }

        long end = System.currentTimeMillis();
        System.out.println("所花费时间为：" + (end - start));

        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
