package nuc.edu.java;

/**
 * @author 薛东
 * @date 2021/5/26 17:25
 */
public class StringTest03 {
    public static void main(String[] args) {
        test01();
        test02();
    }

    public static void test01(){
        /**
         * ①StringBuilder sb = new StringBuilder();
         * ②sb.append("a");
         * ③sb.append("b");
         * ④sb.toString();
         */
        String s1 = "a";
        String s2 = "b";
        String s3 = s1 + s2;
        System.out.println(s1 == s3);  // false
    }

    public static void test02(){
        final String s1 = "a";
        final String s2 = "b";
        String s3 = s1 + s2;
        String s4 = "ab";
        System.out.println(s4 == s3);  // true
    }
}
