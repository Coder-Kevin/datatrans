package org.data.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.data.mapper.DataTransConfigMapper;
import org.data.model.DataTransConfig;
import org.data.service.DataTransService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataTransServiceImpl implements DataTransService {

    @Autowired
    private DataTransConfigMapper dataTransConfigMapper;

    @Override
    public void transData(String dataTransCode) {
        QueryWrapper<DataTransConfig> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(DataTransConfig::getDataTransCode, dataTransCode);
        DataTransConfig dataTransConfig = dataTransConfigMapper.selectOne(queryWrapper);


    }
}
