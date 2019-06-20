package cn.ssm.dao;

import cn.ssm.pojo.Classes;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassesDao {
    //根据老师id查询班级
    Classes findClassesByTeacher(int id);
}