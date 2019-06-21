package com.waction.springcloud.fegin.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author waction
 * @Title: ConfigBean
 * @ProjectName springcloudframework
 * @Description: TODO
 * @date 2019/6/2117:17
 */
@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    public IRule myRule(){
        return new RetryRule();
    }
}
