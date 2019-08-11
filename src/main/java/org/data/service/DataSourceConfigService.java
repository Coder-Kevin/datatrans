package org.data.service;


import com.baomidou.mybatisplus.extension.service.IService;
import org.data.model.DataSourceConfig;

public interface DataSourceConfigService extends IService<DataSourceConfig> {

    void insert(DataSourceConfig dataSourceConfig);

}
