package nuc.edu;

/**
 * @author 薛东
 * @date 2021/5/17 10:56
 */
public class Test05 {
    public static void main(String[] args) {
        Thread thread1 = new Thread();
        Thread thread2 = new Thread();
        System.out.println("卖家做包子");
        thread1.start();
        int num = 0;
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread2.start();
        System.out.println("买家买包子");
    }
}
