package xianchenci;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo {
    public static void main(String[] args) {
        //创建线程池对象
        ExecutorService service = Executors.newFixedThreadPool(4);//大小为2
        for (int i = 0; i < 10; i++) {
            int finalI = i;
            service.submit(()->{
                for (int j = 0; j < 10; j++) {
                    System.out.println(Thread.currentThread().getName()+" "+ finalI +" "+j);
                }
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
        //关闭线程池
        service.shutdown();
    }
}
