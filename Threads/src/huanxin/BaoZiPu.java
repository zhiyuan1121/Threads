package huanxin;

public class BaoZiPu extends Thread{
    BaoZi baozi;
    public BaoZiPu(String name,BaoZi baozi) {
        super(name);
        this.baozi=baozi;
    }

    @Override
    public void run() {
        while(true){
            synchronized (baozi){
                if(baozi.isFlag()==false){
                    System.out.println(getName()+"生产"+baozi.getPier()+baozi.getXianer()+"馅包子中");
                    try {
                        baozi.wait(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    baozi.setFlag(true);
                    System.out.println(getName()+baozi.getPier() +baozi.getXianer()+"馅包子生产完成唤醒吃货");
                    baozi.notify();
                }
            }
        }
    }
}
