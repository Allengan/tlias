package com.itcast.controller;

import com.itcast.pojo.Result;
import com.itcast.utils.AliOSSUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.IOException;

/**
 * TODO 图片上传
 *
 * @author Aaron.
 * @date 2023/9/26 0:41
 */
@RestController
public class UploadController {
    @Resource
    private AliOSSUtils aliOSSUtils;
    @PostMapping("/upload")
    public Result upload(MultipartFile image) throws IOException {
        String url = aliOSSUtils.upload(image);
        return Result.success(url);
    }

}
