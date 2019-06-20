package cn.ssm.service;

import cn.ssm.pojo.User;

import java.util.List;

/**
 * Created by bitsino-001 on 2019/4/30.
 */
public interface IUserService {
    List<User> getUserList();
    void addUser(User user);
}
