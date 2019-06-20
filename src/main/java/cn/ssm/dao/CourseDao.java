package cn.ssm.dao;

import cn.ssm.pojo.Student;
import org.springframework.stereotype.Repository;

/**
 * Created by bitsino-001 on 2019/6/17.
 */
@Repository
public interface CourseDao {
    //根据学生id查询学生信息
    Student getStudentInfo(int id);
}
