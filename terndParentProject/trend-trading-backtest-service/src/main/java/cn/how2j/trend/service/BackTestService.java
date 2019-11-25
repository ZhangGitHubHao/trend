package cn.how2j.trend.service;

import cn.how2j.trend.pojo.IndexData;

import java.util.List;
import java.util.Map;

/**
 * 模拟回测服务类
 * @author zhangh
 * @date 2019/11/13
 */
public interface BackTestService {

    /**
     * 数据列表
     * @param code
     * @return
     */
    List<IndexData> listIndexData(String code);

    Map<String,Object> simulate(int ma, float sellRate, float buyRate, float serviceCharge, List<IndexData> indexDatas);

    float getYear(List<IndexData> allIndexDatas);
}
