package cn.ssm.service.impl;

import cn.ssm.dao.ClassesDao;
import cn.ssm.pojo.Classes;
import cn.ssm.service.IClassesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by bitsino-001 on 2019/6/17.
 */
@Service
public class ClassesServiceImpl implements IClassesService {
    @Autowired
    ClassesDao classesDao;
    @Override
    public Classes getClassesByTeacher(int id) {
        return classesDao.findClassesByTeacher(id);
    }
}
