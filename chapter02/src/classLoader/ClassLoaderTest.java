package classLoader;

/**
 * @author 薛东
 * @date 2021/4/29 19:24
 */
public class ClassLoaderTest {
    public static void main(String[] args) {
        // 获取ClassLoader的加载类  jdk.internal.loader.ClassLoaders$AppClassLoader@3fee733d
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);

        // 获取systemClassLoader的父加载类  jdk.internal.loader.ClassLoaders$PlatformClassLoader@10f87f48
        ClassLoader classLoader = systemClassLoader.getParent();
        System.out.println(classLoader);

        // 当我们试图获取classLoader类加载器的时候，我们发现我们获取不到   null
        ClassLoader bootstrapClassLoader = classLoader.getParent();
        System.out.println(bootstrapClassLoader);

        // 当我们获取我们自定义类的类加载器的时候，我们发现ClassLoaderTest类的类加载器和我们第一个ClassLoader的类加载器是一样的
        // jdk.internal.loader.ClassLoaders$AppClassLoader@3fee733d
        ClassLoader ClassLoadTestClassLoader = ClassLoaderTest.class.getClassLoader();
        System.out.println(ClassLoadTestClassLoader);

        // 当我们获取String类的类加载器的时候，我们发现String类的类加载器也是无法直接获取的
        // null
        // 说明我们的Java核心类库、都是使用引导性类加载器加载的
        // 而像我们自定义的类加载器都是用自定义加载器加载的
        ClassLoader StringClassLoader = String.class.getClassLoader();
        System.out.println(StringClassLoader);
    }
}
