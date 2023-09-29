package com.itcast.utils;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.OSSException;

import com.itcast.pojo.AliOSSConfigurationProperties;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.*;
import java.util.UUID;

/**
 * 阿里云Oss工具类
 */
@Component //将AliOSSUtils注入到IOC容器中,哪个类要使用该类进行文件上传就直接@Resource注入。
public class AliOSSUtils {
    @Resource//将AliOSSConfigurationProperties注入
    private AliOSSConfigurationProperties aliOSSConfigurationProperties;

    /**
     * 实现上传图片到OSS
     */
    public String upload(MultipartFile file) throws IOException {
        //1.获取上传的文件的输入流
        InputStream inputStream = file.getInputStream();
        //2.避免文件覆盖
        String originalFilename = file.getOriginalFilename();
        String fileName = UUID.randomUUID().toString() + originalFilename.substring(originalFilename.lastIndexOf("."));
        //3.上传文件到Oss
        OSS ossClient = new OSSClientBuilder().build(aliOSSConfigurationProperties.getEndpoint(), aliOSSConfigurationProperties.getAccessKeyId(), aliOSSConfigurationProperties.getAccessKeySecret());
        ossClient.putObject(aliOSSConfigurationProperties.getBucketName(), fileName, inputStream);
        //4.文件访问路径
        String url = aliOSSConfigurationProperties.getEndpoint().split("//")[0] + "//" + aliOSSConfigurationProperties.getBucketName() + "." + aliOSSConfigurationProperties.getEndpoint().split("//")[1] + "/" + fileName;
        //5.关闭ossClient
        ossClient.shutdown();
        return url;//6.把上传到oss的路径返回
    }
}
