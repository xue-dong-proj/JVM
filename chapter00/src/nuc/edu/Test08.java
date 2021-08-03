package nuc.edu;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 薛东
 * @date 2021/5/17 11:13
 */
public class Test08 {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList();
        String fileName = null;

        if (fileName == null){
            File file = new File(fileName);
            file.mkdirs();
        }

        FileWriter fw = new FileWriter(fileName);
        for (String s : list) {
            fw.write(s);
        }
        fw.close();
    }
}
