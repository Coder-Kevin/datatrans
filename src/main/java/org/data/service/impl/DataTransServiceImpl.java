package org.data.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.data.execute.impl.JdbcSqlExecutor;
import org.data.mapper.DataSourceConfigMapper;
import org.data.mapper.DataTransConfigMapper;
import org.data.model.DataSourceConfig;
import org.data.model.DataTransConfig;
import org.data.service.DataTransService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataTransServiceImpl implements DataTransService {

    @Autowired
    private DataTransConfigMapper dataTransConfigMapper;

    @Autowired
    private DataSourceConfigMapper dataSourceConfigMapper;

    @Override
    public void transData(String dataTransCode) {
        QueryWrapper<DataTransConfig> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(DataTransConfig::getDataTransCode, dataTransCode);
        DataTransConfig dataTransConfig = dataTransConfigMapper.selectOne(queryWrapper);

        QueryWrapper<DataSourceConfig> dataSourceConfigQueryWrapper = new QueryWrapper<>();
        dataSourceConfigQueryWrapper.lambda().eq(DataSourceConfig::getDataSourceKey, dataTransConfig.getDataSourceCode());
        DataSourceConfig dataSourceConfig = dataSourceConfigMapper.selectOne(dataSourceConfigQueryWrapper);

        JdbcSqlExecutor jdbcSqlExecutor = new JdbcSqlExecutor(dataTransConfig,dataSourceConfig);
        List list = jdbcSqlExecutor.getData();

        System.out.println(list);
    }
}
