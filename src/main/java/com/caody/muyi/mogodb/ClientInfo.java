package com.caody.muyi.mogodb;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * nettyIo 实体类
 */
@Component
@Getter
@Setter
public class ClientInfo {
    private String clientId;
    private boolean isOnline;
    private long mostSignificantBits;
    private long leastSignificantBits;
    private Date lastConnectedTime;
}
