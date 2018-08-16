package com.caody.muyi.mogodb;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class UserEntity {

    private Long id;

    private String userName;

    private String name;

    private int age;
}
