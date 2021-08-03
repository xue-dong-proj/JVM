package nuc.edu;

import java.sql.Date;

/**
 * @author 薛东
 * @date 2021/5/6 16:25
 */
public class LocalVariablesTest {
    public static void main(String[] args) {
        test01(10);
    }

    /**
     * 局部变量表的最大槽数位3：num,str,count
     * @param num
     */
    public static void test01(int num){
        String str = "Hello JVM";
        int count = 10;
        System.out.println(count);
    }

    public String test02(Date dateP,String name2){
        dateP = null;
        name2 = "it";
        // double类型 占用俩个slot。
        double weight = 130.5;
        char gender = '男';
        return dateP + name2;
    }

    public void test03(){
        int a = 10;
        // b 执行完下面的代码之后就销毁
        {
            int b = 0;
            b = a + 1;
        }
        // c使用的是之前已经销毁的局部变量b的slot
        // 也就是slot可重用
        int c = a + 1;
    }
}
