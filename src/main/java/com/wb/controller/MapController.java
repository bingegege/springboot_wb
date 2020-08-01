package com.wb.controller;


import com.wb.common.api.CommonResult;
import com.wb.mbg.model.DyDate;
import com.wb.mbg.model.FivegManagers;
import com.wb.service.MapService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Api(tags = "MapController", description = "基站数据管理")
@Controller
@RequestMapping("/map")
public class MapController {
    @Autowired
    private MapService mapService;

//    @ApiOperation("map测试")
//    @RequestMapping("/quick")
//    @ResponseBody
//    public String quick(){
//        return "map哈哈哈 访问成功!";
//    }

    @ApiOperation("获取管理员账户")
    @RequestMapping(value = "/managerLogin", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult managerLogin(@RequestParam(value = "userName", required = true) String username,
                                         @RequestParam(value = "userPwd", required = true) String pwd) {
        FivegManagers temp=mapService.findManagerByName(username);
        if(temp==null){
            return CommonResult.failed("用户不存在");
        }else{
            if(temp.getPassword().equals(pwd)){
                return CommonResult.success(true,"登陆成功");
            }else{
                return CommonResult.failed("密码错误");
            }
        }
    }

    @ApiOperation("获取所有管理员")
    @RequestMapping(value = "/findAllManager", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult findAllManager() {
        List<FivegManagers> temp=mapService.findAll();
        if(temp==null){
            return CommonResult.failed("表中无管理员账户");
        }else{
            return CommonResult.success(temp,"获取管理员账户成功");
        }
    }

    @ApiOperation("获取rsrp数据")
    @RequestMapping(value = "getMovingRsrpById", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult getMovingRsrpById(@RequestParam(value = "stationId", required = true) int id){
        List<DyDate> list=mapService.findById(id);
        if(list.size()==0){
            return CommonResult.failed("DY_DATE表无此基站id的数据");
        }else{
            List<String> longitudeArr=new ArrayList<>();
            List<String> latitudeArr=new ArrayList<>();
            List<Float> rsrp_ul=new ArrayList<>();
            List<Float> rsrp_dl=new ArrayList<>();
            for (DyDate dyDate : list) {
                longitudeArr.add(dyDate.getLongitude());
                latitudeArr.add(dyDate.getLatitude());
                rsrp_ul.add(dyDate.getRsrpUl());
                rsrp_dl.add(dyDate.getRsrpDl());
            }
            ArrayList res=new ArrayList();
            res.add(longitudeArr);
            res.add(latitudeArr);
            res.add(rsrp_ul);
            res.add(rsrp_dl);
            return CommonResult.success(res,"获取基站RSRP测试数据成功");
        }
    }

    @ApiOperation("添加管理员")
    @RequestMapping(value = "addManager", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult addManager(@RequestBody FivegManagers manager){
        mapService.save(manager);
//        save返回的是影响行数，getId才返回真正的主键id
        int res=manager.getId();
        if(res>0){
            return CommonResult.success(res,"添加管理员成功");
        }else{
            return CommonResult.failed("添加失败");
        }
    }
}
