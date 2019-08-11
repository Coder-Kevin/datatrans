package org.data.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.data.mapper.DataSourceConfigMapper;
import org.data.model.DataSourceConfig;
import org.data.service.DataSourceConfigService;
import org.springframework.stereotype.Service;

@Service
public class DataSourceConfigServiceImpl extends ServiceImpl<DataSourceConfigMapper, DataSourceConfig> implements DataSourceConfigService {
    @Override
    public void insert(DataSourceConfig dataSourceConfig) {
        baseMapper.insert(dataSourceConfig);
    }
}
