package cn.ssm.dao;

import cn.ssm.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by bitsino-001 on 2019/4/29.
 */

@Repository
public interface UserDao {
    //查询用户
    List<User> getUserInfo();
    //添加用户
    void addUser(User user);
}
