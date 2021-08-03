package nuc.edu.java;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 薛东
 * @date 2021/5/29 21:19
 */
public class StopTheWordDemo {

    public static class WorkThread extends Thread{
        List<byte[]> list = new ArrayList<>();

        @Override
        public void run(){
            try {
                while (true){
                    for (int i = 0; i < 1000; i++) {
                        byte[] buffer = new byte[1024];
                        list.add(buffer);
                    }

                    if (list.size() > 10000){
                        list.clear();
                        System.gc();  // System.gc()会触发full gc，进而触发STW
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static class PrintThread extends Thread{
        public final long startTime = System.currentTimeMillis();

        @Override
        public void run() {
            try {
                while (true){
                    long t = System.currentTimeMillis() - startTime;
                    System.out.println(t / 1000 + "." + t % 1000);
                    Thread.sleep(1000);
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        WorkThread workThread = new WorkThread();
        PrintThread printThread = new PrintThread();
        workThread.start();
        //printThread.start();
    }

}
