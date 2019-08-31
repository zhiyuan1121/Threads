package huanxin;

public class Demo {
    public static void main(String[] args) {
        BaoZi baozi = new BaoZi("冰皮","牛肉");
        BaoZiPu tbaozipu = new BaoZiPu("包子铺",baozi);
        ChiHuo cihuo = new ChiHuo("吃货", baozi);
        tbaozipu.start();
        cihuo.start();

    }
}
