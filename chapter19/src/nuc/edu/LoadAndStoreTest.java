package nuc.edu;

import java.util.Date;

/**
 * @author 薛东
 * @date 2021/6/3 17:45
 */
public class LoadAndStoreTest {
    public void load(int num,Object obj,long count,boolean flag,short[] arr){
        System.out.println(num);
        System.out.println(obj);
        System.out.println(count);
        System.out.println(flag);
        System.out.println(arr);
    }

    public void pushConstLdc(){
        int i = -1;
        int a = 5;
        int b = 6;
        int c = 127;
        int d = 128;
        int e = 32767;
        int f = 32768;
    }

    public void constLdc(){
        long a1 = 1;
        long a2 = 2;
        float b1 = 2;
        float b2 = 3;
        double c1 = 1;
        double c2 = 2;
        Date d = null;
    }

    public void store(int k, double d){
        int m = k + 2;
        long l = 12;
        String str = "zyw";
        float f = 10.0F;
        d = 10;
    }

    public void foo(long l, float f){
        {
            int i = 0;
        }
        {
            String s = "Hello World";
        }
    }
}
