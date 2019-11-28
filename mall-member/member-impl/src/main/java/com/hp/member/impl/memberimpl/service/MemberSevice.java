package com.hp.member.impl.memberimpl.service;

import com.hp.member.api.memberapi.api.ITestUser;
import com.hp.member.api.memberapi.entity.TestUser;
import com.hp.member.impl.memberimpl.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberSevice implements ITestUser {
    @Autowired
    TestMapper testMapper;
    @RequestMapping("/hello")
    public String getData(){
        return "第一个微服务";
    }

    @Override
    public TestUser getUser() {
        TestUser getuser = testMapper.getuser();
        return getuser;
    }
}
