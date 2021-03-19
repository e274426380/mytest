package com.yaorange.mapper;

import com.yaorange.entity.CropArea;
import com.yaorange.base.BaseMapper;

import java.util.List;
import java.util.Map;


public interface CropAreaMapper extends BaseMapper<CropArea> {
    List<Map<String, Object>> selectColumn();
}
