package com.caody.muyi.core.config;

import com.corundumstudio.socketio.SocketIOServer;
import com.corundumstudio.socketio.annotation.SpringAnnotationScanner;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NettySocketConfig {
    @Value("${wss.server.port}")
    private int WSS_PORT;
    @Value("${wss.server.host}")
    private String WSS_HOST;

    @Bean
    public SocketIOServer socketIOServer() {
        com.corundumstudio.socketio.Configuration config = new com.corundumstudio.socketio.Configuration();
        //不设置主机、默认绑定0.0.0.0 or ::0
        //config.setHostname(WSS_HOST);
        config.setPort(WSS_PORT);
        //该处进行身份验证h
        config.setAuthorizationListener(handshakeData -> {
            //http://localhost:8081?username=test&password=test
            //例如果使用上面的链接进行connect，可以使用如下代码获取用户密码信息
            //String username = data.getSingleUrlParam("username");
            //String password = data.getSingleUrlParam("password");
            return true;
        });
        final SocketIOServer server = new SocketIOServer(config);
        return server;
    }

    @Bean
    public SpringAnnotationScanner springAnnotationScanner(SocketIOServer socketServer) {
        return new SpringAnnotationScanner(socketServer);
    }
}
