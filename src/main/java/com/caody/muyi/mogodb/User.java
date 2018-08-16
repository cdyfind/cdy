package com.caody.muyi.mogodb;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Setter
@Getter
@Component
public class User {

    // @id这个注解来对应mongo的_id这个字段
    @Id
    private Integer id;
    private String name;
    private String password;
}
