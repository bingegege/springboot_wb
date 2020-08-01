package com.wb.controller;

import com.wb.domain.SysLog;
import com.wb.service.SysLogService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Api(tags = "SysLogController", description = "日志测试")
@Controller
@RequestMapping("/log")
public class SysLogController {

    @Autowired
    private SysLogService sysLogService;

    @ApiOperation("查询所有日志")
    @RequestMapping(value = "/queryAllLog", method = RequestMethod.GET)
    @ResponseBody
    public List<SysLog> queryAllLog(){
        List<SysLog> lists = sysLogService.findAll();
        return lists;
    }
}
