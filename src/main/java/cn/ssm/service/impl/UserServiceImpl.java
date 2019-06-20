package cn.ssm.service.impl;

import cn.ssm.dao.UserDao;
import cn.ssm.pojo.User;
import cn.ssm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by bitsino-001 on 2019/4/30.
 */
@Transactional
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    UserDao userDao;
    @Override
    public List<User> getUserList() {
        return userDao.getUserInfo();
    }

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }
}
