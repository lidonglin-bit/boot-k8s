package com.donglin.jwt.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
/**
 * 读取yml中的配置
 */
@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TencentConfig implements InitializingBean {
    @Value("${TencentCos.CosPath}")
    private String cosPath;

    @Value("${TencentCos.SecretId}")
    private String secretId;

    @Value("${TencentCos.SecretKey}")
    private String secretKey;
    @Value("${TencentCos.region}")
    private String regionName;

    @Value("${TencentCos.testBucket}")
    private String bucketName;

    @Value("${TencentCos.APPID}")
    private String appId ;


    public static String COSPATH;
    public static String SECRET_ID;
    public static String SECRET_KEY;
    public static String REGION_NAME;
    public static String BUCKET_NAME;
    public static String APPID;

    @Override
    public void afterPropertiesSet() throws Exception {
        COSPATH = cosPath;
        SECRET_ID = secretId;
        SECRET_KEY = secretKey;
        REGION_NAME = regionName;
        BUCKET_NAME = bucketName;
        APPID = appId;

    }
}