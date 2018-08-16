package com.caody.muyi.mogodb;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.Date;
@Component
@Getter
@Setter
public class OperationLog {
    /**
     * 日志类型
     */
    private String logtype;
    /**
     * 日志名称
     */
    private String logname;
    /**
     * 用户id
     */
    private Integer userid;
    /**
     * 类名称
     */
    private String classname;
    /**
     * 方法名称
     */
    private String method;
    /**
     * 创建时间
     */
    private Date createtime;
    /**
     * 是否成功
     */
    private String succeed;
    /**
     * 备注
     */
    private String message;
}
