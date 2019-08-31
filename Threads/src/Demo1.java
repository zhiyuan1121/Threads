public class Demo1 {
    public static void main(String[] args) {
//        MyThread mt = new MyThread("线程一","s1");
//        MyThread MT = new MyThread("线程二","s2");
//        Thread t = new Thread(()->{
//            for (int i = 0; i < 10; i++) {
//                System.out.println(Thread.currentThread().getName()+" "+i);
//            }
//        },"线程三");
//        mt.start();
//        MT.start();
//        t.start();
        MyThread2 myThread2 = new MyThread2();
        for (int i = 0; i < 10; i++) {
            new Thread(myThread2,"线程"+i).start();
        }
    }
}
