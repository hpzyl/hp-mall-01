package com.hp.member.api.memberapi.api;

import com.hp.member.api.memberapi.entity.TestUser;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/testUser")
public interface ITestUser {
    @RequestMapping("/getUser")
    public TestUser getUser();
}
