package com.yaorange.service;

import com.yaorange.entity.CropArea;

import java.util.List;
import java.util.Map;

/**
 * Created by 不要剁我爪 on 2021/3/9.
 */
public interface CropAreaService {
    List<CropArea> getAll();
    List<Map<String, Object>> getColumnName();
}
