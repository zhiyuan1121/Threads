public class Demo2 {
    public static Object object = new Object();

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    synchronized (object){
                        try {
                            System.out.println(Thread.currentThread().getName() + "=== 获取到锁对象，调用wait方法，进入waiting状态，释放锁对象");
                            object.wait();
                        }catch (Exception e){
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName()+"=== 从waiting状态醒来，获取锁对象，继续执行了");
                    }
                }
            }
        },"等待线程").start();

        new Thread(()->{
            while (true){
                try {
                    System.out.println(Thread.currentThread().getName()+"‐‐‐‐‐ 等待3秒钟");
                    Thread.sleep(3000);
                }catch (Exception e){
                    e.printStackTrace();
                }
                synchronized (object){
                    System.out.println(Thread.currentThread().getName()+"--------- 获取锁对象，调用notify方法，唤醒休眠线程");
                    object.notify();
                }
            }
        },"唤醒线程").start();
    }
}
