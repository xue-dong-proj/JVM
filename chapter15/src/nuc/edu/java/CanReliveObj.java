package nuc.edu.java;

/**
 * @author 薛东
 * @date 2021/5/28 15:30
 *
 * 测试Object类中finalize()方法，即对象的finalization机制
 */
public class CanReliveObj {
    public static CanReliveObj obj;

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("调用当前类重写的finalize()方法");
        obj = this;
    }

    public static void main(String[] args) {
        try {
            obj = new CanReliveObj();
            // obj指向为空，但是有一次finalize()的机会复活，所以不会立马被回收
            obj = null;
            System.gc();
            System.out.println("第一次gc");
            // 因为finalize()方法是一个优先级比较低的方法，所以等待2s，等待finalize()方法被调用
            // 被调用后，obj对象被复活，所以不会被gc回收
            Thread.sleep(2000);
            if (obj == null){
                System.out.println("obj is dead");
            }else {
                System.out.println("obj is still alive");
            }

            System.out.println("第二次gc");
            obj = null;
            System.gc();
            Thread.sleep(2000);

            // 但是第二次finalize()方法只能别调用一次，所以就不会再被复活了，而是被直接回收了
            if (obj == null){
                System.out.println("obj is dead");
            }else {
                System.out.println("obj is still alive");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
