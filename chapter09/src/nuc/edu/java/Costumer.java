package nuc.edu.java;

/**
 * @author 薛东
 * @date 2021/5/21 11:25
 *
 * 测试对象的实例化过程
 * ①加载类元信息  ②为对象分配内存  ③处理并发问题
 * ④属性的默认初始化（零值初始化）  ⑤设置对象头的信息  ⑥属性的显示初始化，代码块中的初始化，构造器中的初始化
 *
 * 给对象的属性值初始化：
 * ①默认初始化
 * ②代码块中的属性初始化 / ③显示初始化
 * ④构造器中的初始化
 *
 */
public class Costumer {
    int id = 1001;
    String name;
    Account acct;

    {
        name = "报名客户";
    }

    public Costumer(){
        acct = new Account();
    }
}

class Account{

}
