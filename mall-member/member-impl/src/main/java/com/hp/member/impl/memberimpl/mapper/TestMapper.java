package com.hp.member.impl.memberimpl.mapper;

import com.hp.member.api.memberapi.entity.TestUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface TestMapper {
    public TestUser getuser();
}
