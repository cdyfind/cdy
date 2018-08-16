package com.caody.muyi.service.impl;

import com.caody.muyi.mogodb.Chat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service
public class MongodbService {
    @Autowired
    private MongoTemplate mongoTemplate;

    public void save(Chat chat){
        mongoTemplate.save(chat);
    }
}
