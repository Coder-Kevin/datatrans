package org.data.web;

import org.data.common.ResponseVo;
import org.data.common.util.ResponseUtil;
import org.data.service.DataTransService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/datatrans")
public class DataTransController {

    @Autowired
    private DataTransService dataTransService;

    @GetMapping("/{dataTransCode}")
    public ResponseVo execute(@PathVariable String dataTransCode){

        dataTransService.transData(dataTransCode);
        return ResponseUtil.success("执行成功");
    }
}
