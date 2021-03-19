package com.yaorange.service.impl;

import com.yaorange.entity.TotalProduction;
import com.yaorange.mapper.TotalProductionMapper;
import com.yaorange.service.TotalProductionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by 不要剁我爪 on 2021/3/9.
 */
@Service
@Transactional
public class TotalProductionServiceImpl implements TotalProductionService {
    @Autowired
    private TotalProductionMapper totalProductionMapper;

    @Override
    public List<TotalProduction> getAll() {
        return totalProductionMapper.selectAll();
    }
}
