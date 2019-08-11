package org.data.web;

import org.data.common.ResponseVo;
import org.data.model.DataSourceConfig;
import org.data.service.DataSourceConfigService;
import org.data.common.util.ResponseUtil;
import org.data.web.vo.DataSourceConfigVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/sourceconfig")
public class DataSourceConfigManageController {

    @Autowired
    private DataSourceConfigService dataSourceConfigService;

    @PostMapping
    @ResponseBody
    public ResponseVo create(@RequestBody @Validated DataSourceConfigVo dataSourceConfigVo){

        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        BeanUtils.copyProperties(dataSourceConfigVo,dataSourceConfig);
        System.out.println(dataSourceConfig);
        dataSourceConfigService.insert(dataSourceConfig);
        return ResponseUtil.success("新增成功");
    }

    @PatchMapping
    @ResponseBody
    public ResponseVo update(@RequestBody @Validated DataSourceConfigVo dataSourceConfigVo){
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        BeanUtils.copyProperties(dataSourceConfigVo,dataSourceConfig);
        System.out.println(dataSourceConfig);
        dataSourceConfigService.updateById(dataSourceConfig);
        return ResponseUtil.success("更新成功");
    }


    @GetMapping("/list")
    @ResponseBody
    public ResponseVo getList(){
        List<DataSourceConfig> dataSourceConfigs = dataSourceConfigService.list();
        return ResponseUtil.success(dataSourceConfigs);
    }
}
