package nuc.edu;

import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author 薛东
 * @date 2021/5/17 11:03
 */
public class Test06 {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("E:\fr.txt");
        FileWriter fw = new FileWriter("E:\fw.txt");

        int len = 0;
        char[] bytes = new char[1024];
        while ((len = fr.read(bytes)) != -1){
            fw.write(bytes);
            fw.flush();
        }
        fr.close();
        fw.close();
    }
}
