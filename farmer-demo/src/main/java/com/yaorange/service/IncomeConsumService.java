package com.yaorange.service;

import com.yaorange.entity.IncomeConsum;

import java.util.List;
import java.util.Map;

/**
 * Created by 不要剁我爪 on 2021/3/9.
 */
public interface IncomeConsumService {
    List<Map<String, Object>> getIncomeConsumData(int icDate);
    List<Map<String, Object>> getIncomeConsumAll();
    List<Map<String, Object>> getColumnName();
    List<Integer> getDateYear();

    List<IncomeConsum> getAll();
}
