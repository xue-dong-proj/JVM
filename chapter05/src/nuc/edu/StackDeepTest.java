package nuc.edu;

/**
 * @author 薛东
 * @date 2021/5/1 17:48
 */
// 设置栈的大小 -Xss256k 后：2471
public class StackDeepTest {
    public static int count = 1;
    public static void main(String[] args) {
        System.out.println(count);  // 11407
        count++;
        // Exception in thread "main" java.lang.StackOverflowError
        main(args);
    }
}
