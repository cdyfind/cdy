package com.caody.muyi;

import com.caody.muyi.core.config.TaskPoolConfig;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.socket.config.annotation.EnableWebSocket;

@EnableRabbit  //消息队列配置
@EnableCaching  //开启缓存
@EnableAsync(proxyTargetClass = true)//开启异步处理
@EnableScheduling//开启异步
@EnableMongoRepositories//开启MongoDB配置
@EnableWebSocket//开启webSocket配置
@SpringBootApplication
public class MuYiApplication{

	public static void main(String[] args) {
		SpringApplication.run(MuYiApplication.class, args);

	}
}
