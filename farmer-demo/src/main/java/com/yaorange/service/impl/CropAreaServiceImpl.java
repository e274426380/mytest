package com.yaorange.service.impl;

import com.yaorange.entity.CropArea;
import com.yaorange.mapper.CropAreaMapper;
import com.yaorange.service.CropAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * Created by 不要剁我爪 on 2021/3/9.
 */
@Service
@Transactional
public class CropAreaServiceImpl implements CropAreaService {
    @Autowired
    private CropAreaMapper cropAreaMapper;

    @Override
    public List<CropArea> getAll() {
        return cropAreaMapper.selectAll();
    }

    @Override
    public List<Map<String, Object>> getColumnName() {
            return cropAreaMapper.selectColumn();
    }
}
