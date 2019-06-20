package cn.ssm.service.impl;

import cn.ssm.dao.CourseDao;
import cn.ssm.pojo.Student;
import cn.ssm.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by bitsino-001 on 2019/6/17.
 */
@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    CourseDao courseDao;
    @Override
    public Student courses(int id) {
        return courseDao.getStudentInfo(id);
    }
}
