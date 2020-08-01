package com.wb.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Api(tags = "FileController", description = "文件上传测试")
@Controller
@RequestMapping("/file")
public class FileController {

    @ApiOperation("文件上传")
    @RequestMapping(value = "/fileUpload", method = RequestMethod.POST)
    @ResponseBody
    public String fileUpload(@RequestParam MultipartFile file,HttpServletRequest request) {
        if (file.isEmpty()) {
            System.out.println("文件为空空");
            return "no file";
        }
        String fileName = file.getOriginalFilename();  // 文件名
        String suffixName = fileName.substring(fileName.lastIndexOf("."));  // 后缀名
        String filePath = "F://springbootdemo//file//"; // 上传后的路径
        fileName = UUID.randomUUID() + suffixName; // 新文件名
        File dest = new File(filePath + fileName);
        if (!dest.getParentFile().exists()) {
            dest.getParentFile().mkdirs();
        }
        try {
            file.transferTo(dest);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return filePath + fileName;
    }
}
