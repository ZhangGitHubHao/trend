package cn.how2j.trend.pojo;

import java.io.Serializable;

/**
 * 指数类，用于指数里的名称和代码
 * @author zhangh
 * @date 2019/11/05
 */
public class Index implements Serializable {
    private String code;
    private String name;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Index{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
