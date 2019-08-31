import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread2 implements Runnable{
    static int p=100;

    Lock lock = new ReentrantLock();
    @Override
    public void run() {
        while (true) {
            lock.lock();
            if (p > 0) {
                System.out.println(Thread.currentThread().getName() + " " + p--);
            }
            if (p <= 0) break;
            lock.unlock();
        }
    }

    public synchronized void sellTicket(){
        if (p > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + p--);
        }
    }
}
