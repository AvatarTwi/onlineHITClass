package com.hit.onlineclass.vod.controller;

import com.hit.onlineclass.result.Result;
import com.hit.onlineclass.vod.service.FileService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@Api(tags = "文件上传接口")
@RestController
@RequestMapping("/admin/vod/file")
public class FileUploadController {

    @Autowired
    private FileService fileService;

    @ApiOperation("文件上传")
    @PostMapping("upload")
    public Result uploadFile(
            MultipartFile file) {
        String url = fileService.upload(file);
        return Result.ok(url).message("上传文件成功");
    }
}
