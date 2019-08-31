package huanxin;

public class ChiHuo extends Thread{
    BaoZi baozi;
    int count=0;
    public ChiHuo(String name,BaoZi baozi) {
        super(name);
        this.baozi = baozi;
    }

    @Override
    public void run() {
        while(true){
            synchronized (baozi){
                if(baozi.isFlag()==true) {
                    System.out.println(getName() + "开始吃" + baozi.getPier()  + baozi.getXianer() + "馅包子");
                    try {
                        baozi.wait(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    baozi.setFlag(false);
                    System.out.println(baozi.getPier()  + baozi.getXianer() + "馅包子吃完，开始等待包子制作");
                    if(++count%2==0){
                        baozi.setPier("面皮");
                        baozi.setXianer("羊肉");
                    } else {
                        baozi.setPier("饼皮");
                        baozi.setXianer("牛肉");
                    }
                    try {
                        baozi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
