package nuc.edu;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 薛东
 * @date 2021/5/17 10:27
 */
public class Test01 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int num = (int) (Math.random() * 20 + 1);
            if(!list.contains(num)){
                list.add(num);
                System.out.println(num);
            }else {
                i--;
            }
        }

    }
}
