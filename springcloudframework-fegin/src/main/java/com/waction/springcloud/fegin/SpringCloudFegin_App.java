package com.waction.springcloud.fegin;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.waction.springcloud"})
@ComponentScan("com.waction.springcloud")
public class SpringCloudFegin_App
{
	public static void main(String[] args)
	{
		SpringApplication.run(SpringCloudFegin_App.class, args);
	}
}
