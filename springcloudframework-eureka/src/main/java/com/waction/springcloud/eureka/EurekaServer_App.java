package com.waction.springcloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/**
 * 微服务注册中心
 * @author Administrator
 *
 */
@SpringBootApplication
@EnableEurekaServer // EurekaServer服务器端启动类,接受其它微服务注册进来
public class EurekaServer_App
{
	public static void main(String[] args)
	{
		SpringApplication.run(EurekaServer_App.class, args);
	}
}
