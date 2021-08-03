package nuc.edu.java;

/**
 * @author 薛东
 * @date 2021/5/27 14:35
 */
public class StringInternTest {
    public static void main(String[] args) {
        // 执行完之后，会在字符串常量池中生成字符串"ab"；
        // 在执行s1.intern()时，回去字符串常量池中寻找字符串"ab"，发现有，就用字符串常量池里的"ab"
        // 所以是false
        //String s1 = new String("ab");  //false

        /**
         * 执行完之后，会在字符串常量池中创建一个字符串的引用地址
         * 不会再字符串常量池中生成字符串"ab"
         * 在执行s1.intern()之后，会去字符串常量池中找字符串"ab"的引用地址
         * 发现找到了，所以就是返回true
         */
        String s1 = new String("a") + new String("b");  // true

        s1.intern();
        String s2 = "ab";
        System.out.println(s1 == s2);
    }
}
