package com.czf.apply.dao.mapper;

import com.czf.apply.dao.entity.User;
import org.springframework.stereotype.Component;

/**
 * @author 10098
 */
@Component
public interface UserMapper {

    /**
     *  根据激活码查询用户
     * @param activeCode
     * @return
     */
    User selectUserByActiveCode(String activeCode);
}
