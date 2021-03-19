package com.yaorange.service.impl;

import com.yaorange.entity.IncomeConsum;
import com.yaorange.mapper.IncomeConsumMapper;
import com.yaorange.service.IncomeConsumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.List;
import java.util.Map;

/**
 * Created by 不要剁我爪 on 2021/3/9.
 */
@Service
@Transactional
public class IncomeConsumServiceImpl implements IncomeConsumService {
    @Autowired
    private IncomeConsumMapper incomeConsumMapper;

    @Override
    public List<Map<String, Object>> getIncomeConsumData(int icDate) {
        return incomeConsumMapper.selectIncomeConsumData(icDate);
    }

    @Override
    public List<Map<String, Object>> getIncomeConsumAll() {
        return incomeConsumMapper.selectIncomeConsumAll();
    }

    @Override
    public List<Map<String, Object>> getColumnName() {
        return incomeConsumMapper.selectColumn();
    }

    @Override
    public List<Integer> getDateYear() {
        return incomeConsumMapper.selectDateAll();
    }
    @Override
    public List<IncomeConsum> getAll() {
        return incomeConsumMapper.selectAll();
    }
}
