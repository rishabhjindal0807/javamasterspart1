package com.yubi.BRMS.dao.user;

import com.yubi.BRMS.model.User;

public interface UserDao {
    User findByUserId(String userId);

    User findByUserName(String username);

}
