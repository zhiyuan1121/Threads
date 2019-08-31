public class MyThread extends Thread{
    private String u;
    public MyThread(String name,String u) {
        super(name);
        this.u=u;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if("s2".equals(u)){
                try {
                    sleep(100);//设置延迟
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(currentThread());//返回对象的引用
            }
            System.out.println(getName()+""+i+" "+u);
        }
    }
}
