package nuc.edu;

/**
 * @author 薛东
 * @date 2021/5/1 18:13
 */
public class StackFrameTest {
    public static void main(String[] args) {
        try {
            StackFrameTest stackFrameTest = new StackFrameTest();
            stackFrameTest.method01();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("main()执行结束");
    }

    public void method01(){
        System.out.println("method01()正在执行");
        method02();
        // int a = 10 / 0;
        System.out.println("method01()执行结束");
    }

    public int method02() {
        System.out.println("method02()正在执行");
        int m = (int) method03();
        int i = 10;
        System.out.println("method02()执行结束");
        return m + i;
    }

    public double method03() {
        System.out.println("method03()正在执行");
        double a = 20.0;
        System.out.println("method03()执行结束");
        return a;
    }
}
