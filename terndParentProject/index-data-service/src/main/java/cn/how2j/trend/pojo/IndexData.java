package cn.how2j.trend.pojo;

/**
 * 指数数据实体类
 * @author zhangh
 * @date 2019/11/07
 */
public class IndexData {
    String date;
    float closePoint;
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public float getClosePoint() {
        return closePoint;
    }
    public void setClosePoint(float closePoint) {
        this.closePoint = closePoint;
    }

    @Override
    public String toString() {
        return "IndexData{" +
                "date='" + date + '\'' +
                ", closePoint=" + closePoint +
                '}';
    }
}
