package nuc.edu.java1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 薛东
 * @date 2021/6/18 21:13
 */
public class HeapOOM {
    static class OOMObject{

    }
    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<>();
        while (true){
            list.add(new OOMObject());
        }
    }
}
