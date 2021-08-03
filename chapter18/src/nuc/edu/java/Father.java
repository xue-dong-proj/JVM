package nuc.edu.java;

/**
 * @author 薛东
 * @date 2021/6/2 15:44
 */
public class Father {
    int x = 10;
    public Father(){
        this.print();
        x = 20;
    }

    public void print(){
        System.out.println("Father.x = " + x);
    }
}

class Son extends Father{
    int x = 30;
    public Son(){
        this.print();
        x = 40;
    }

    public void print(){
        System.out.println("Son.x = " + x);
    }
}

