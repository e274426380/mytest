package com.yaorange.service.impl;

import com.yaorange.mapper.OpenerNumberMapper;
import com.yaorange.service.OpenerNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by 不要剁我爪 on 2021/3/9.
 */
@Service
@Transactional
public class OpenerNumberServiceImpl implements OpenerNumberService {
    @Autowired
    private OpenerNumberMapper openerNumberMapper;
}
