package com.caody.muyi.controller;


import com.aliyun.oss.ServiceException;
import com.caody.muyi.model.SktCarts;
import com.caody.muyi.mogodb.OperationLog;
import com.caody.muyi.mogodb.User;
import lombok.extern.slf4j.Slf4j;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/mogodb")
@Slf4j
public class mogodbController {

    @Autowired
    private MongoTemplate mongoTemplate;

    @RequestMapping(value = "/save")
    public void save(){
        User user = new User();
        user.setId(2);
        user.setName("bbbb");
        user.setPassword("2222");
        mongoTemplate.save(user);

    }

    @RequestMapping(value = "/getName")
    public Object getName(){
        String name = mongoTemplate.getDb().getName();
        return name;
    }

    @RequestMapping(value = "/getValue")
    public List<User> getValue(){
        Query query = new Query(Criteria.where("password").is("2222"));
        List<User> list = mongoTemplate.find(query,User.class);
        return list;
    }

    @RequestMapping(value = "/delete")
    public void delete(){
//        Criteria criteria = Criteria.where("name").is("aaaa");
//        Query query = new Query(criteria);
//        mongoTemplate.remove(query,User.class);
        Query query = new Query();
        mongoTemplate.remove(query,OperationLog.class);
    }

    @RequestMapping(value = "/test")
    public void test(){
        throw new ServiceException("业务出现异常");
    }

    @RequestMapping(value = "/getLog")
    public Object getLog(){
        Query query = new Query();
        List<OperationLog>  logs = mongoTemplate.find(query,OperationLog.class);
        return logs;
    }

//    @RequestMapping(value = "/deleteLog")
//    private void deleteLog(){
//        Criteria criteria = Criteria.where("logname").is("cdy");
//        Query query = new Query(criteria);
//        mongoTemplate.remove(query,OperationLog.class);
//    }


}
