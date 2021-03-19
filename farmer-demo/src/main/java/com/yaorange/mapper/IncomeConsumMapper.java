package com.yaorange.mapper;

import com.yaorange.entity.IncomeConsum;
import com.yaorange.base.BaseMapper;

import java.util.List;
import java.util.Map;

public interface IncomeConsumMapper extends BaseMapper<IncomeConsum> {
    List<Map<String, Object>> selectIncomeConsumData(Integer icDate);
    List<Map<String, Object>> selectColumn();

    List<Map<String, Object>> selectIncomeConsumAll();

    List<Integer> selectDateAll();
}
