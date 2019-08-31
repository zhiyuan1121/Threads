package huanxin;

public class BaoZi {
    private String pier;
    private String xianer;
    private boolean flag = false;//判断包子是否存在

    public BaoZi(String pier, String xianer) {
        this.pier = pier;
        this.xianer = xianer;
    }

    public String getPier() {
        return pier;
    }

    public String getXianer() {
        return xianer;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setPier(String pier) {
        this.pier = pier;
    }

    public void setXianer(String xianer) {
        this.xianer = xianer;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
