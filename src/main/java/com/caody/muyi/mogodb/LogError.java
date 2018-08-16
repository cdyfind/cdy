package com.caody.muyi.mogodb;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Setter
@Getter
public class LogError {

    private String user;
    private Date time;
    private String path;
    private String param;
    private boolean isError;
    private String info;
    private String message;

}
