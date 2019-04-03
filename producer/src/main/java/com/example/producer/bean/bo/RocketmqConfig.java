package com.example.producer.bean.bo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

/**
 * @Auther: gaoyang
 * @Date: 2019/3/15 15:15
 * @Description:
 */
@Data
@Component
@ConfigurationProperties(prefix = "rocketmq.producer")
public class RocketmqConfig {

    private String namesrvAddr;
    private String groupName;
}
