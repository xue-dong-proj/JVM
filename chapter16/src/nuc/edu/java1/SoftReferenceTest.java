package nuc.edu.java1;

import java.lang.ref.SoftReference;

/**
 * @author 薛东
 * @date 2021/5/30 14:21
 *
 * 软引用，当内存空间够的时候不进行回收
 * 当内存空间不足的时候，才进行回收
 */
public class SoftReferenceTest {
    public static class User{
        public User(int id,String name){
            this.id = id;
            this.name = name;
        }

        public int id;
        public String name;

        @Override
        public String toString(){
            return "[id=" + id + ",name" + name + "]";
        }
    }

    public static void main(String[] args) {
        SoftReference<User> softReference = new SoftReference<>(new User(1,"hello"));
        System.out.println(softReference.get());

        System.gc();
        System.out.println("after gc:");
        System.out.println(softReference.get());

        try {
            byte[] b = new byte[1024 * 1024 * 7];
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println(softReference.get());
        }

    }
}
