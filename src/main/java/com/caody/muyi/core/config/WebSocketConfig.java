package com.caody.muyi.core.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

import javax.websocket.server.ServerEndpointConfig;

@ConditionalOnWebApplication
@Configuration
public class WebSocketConfig extends ServerEndpointConfig.Configurator implements ApplicationContextAware
{
    private static volatile BeanFactory context;
    /**
     * 配置WebSocketEndpointServer
     * 如果使用独立的servlet容器，不是使用SpringBoot的内置容器
     * 不需要注入ServerEndpointExporter, 它将由容器自己提供和管理
     * @return
     */
    @Bean
    public ServerEndpointExporter serverEndpointExporter () {
        return new ServerEndpointExporter();
    }

    @Override
    public <T> T getEndpointInstance(Class<T> clazz) throws InstantiationException
    {
        return context.getBean(clazz);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("auto load"+this.hashCode());
        WebSocketConfig.context = applicationContext;
    }
}
