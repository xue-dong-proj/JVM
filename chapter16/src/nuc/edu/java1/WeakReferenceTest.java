package nuc.edu.java1;

import java.lang.ref.WeakReference;

/**
 * @author 薛东
 * @date 2021/5/30 14:27
 *
 * 弱引用，当进行回收的时候
 * 不管内存够还是不够，都会被回收
 */
public class WeakReferenceTest {
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
        WeakReference<User> weakReference = new WeakReference<>(new User(1,"hello"));
        System.out.println(weakReference.get());

        System.gc();
        System.out.println("after gc:");
        System.out.println(weakReference.get());

    }
}
