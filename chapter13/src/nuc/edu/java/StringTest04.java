package nuc.edu.java;

/**
 * @author 薛东
 * @date 2021/5/27 10:54
 */
public class StringTest04 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        test01(1000000);  // 13
        //test02(100000);  // 3747
        long end = System.currentTimeMillis();
        System.out.println("花费时间：" + (end - start));
    }

    /**
     * 用字符串拼接的方式耗时比用StringBuilder的append()方法拼接长
     * 用字符串拼接的方式，每次都要创建一个StringBuilder对象和String对象，会占用大量的空间
     *          同时，StringBuilder最大能拼接的最大为16
     *  public StringBuilder() {
     *         super(16);
     *  }
     *
     *  StringBuilder需要不断的进行扩容，所以耗时长
     */


    public static void test01(int levelHigh){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < levelHigh; i++) {
            sb.append("a");
        }
    }

    public static void test02(int levelHigh){
        String sc = "";
        for (int i = 0; i < levelHigh; i++) {
            sc = sc + "a";
        }
    }
}
