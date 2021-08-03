package nuc.edu.java;

/**
 * @author 薛东
 * @date 2021/5/26 16:48
 */
public class StringTest02 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        String s3 = "HelloWorld";
        String s4 = "Hello" + "World";
        String s5 = s1 + "World";
        String s6 = "Hello" + s2;
        String s7 = s1 + s2;

        System.out.println(s3 == s4);  // true
        System.out.println(s3 == s5);  // false
        System.out.println(s4 == s5);  // false
        System.out.println(s6 == s5);  // false
        System.out.println(s7 == s5);  // false
        System.out.println(s6 == s7);  // false

        // intern:判断常量池中有没有HelloWorld，如果有，就返回它的地址
        // 如果没有就在常量池中加载一个HelloWorld，然后返回它的地址
        String s8 = s3.intern();
        System.out.println(s8 == s3);  // true
    }
}
