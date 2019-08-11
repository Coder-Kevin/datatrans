package org.data.web;

import org.data.common.ResponseVo;
import org.data.common.util.ResponseUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/datatrans")
public class DataTransController {

    @GetMapping
    public ResponseVo execute(){


        return ResponseUtil.success("执行成功");
    }
}
