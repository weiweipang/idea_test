package cn.ssm.controller;

import cn.ssm.pojo.Classes;
import cn.ssm.pojo.Student;
import cn.ssm.pojo.User;
import cn.ssm.service.IClassesService;
import cn.ssm.service.IStudentService;
import cn.ssm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by bitsino-001 on 2019/4/29.
 */
@Controller
@RequestMapping("/user")
public class UserInfoController {
    @Autowired
    IUserService userService;

    @Autowired
    IStudentService studentService;

    @Autowired
    IClassesService classesService;

    @RequestMapping("/info")
    public String userinfo(){
        System.out.println(userService);
        return "index";
    }

    @RequestMapping("/add")
    @ResponseBody
    public void addUser(){
        User user = new User();
        user.setName("赵四");
        user.setAge(50);
        user.setSex("男");
        userService.addUser(user);

    }

    @RequestMapping("/student")
    public @ResponseBody Student studentInfo(@RequestParam("id") int id){
        Student courses = studentService.courses(id);
        System.out.println(courses);
        return courses;
    }

    @RequestMapping("/classes")
    public @ResponseBody Classes classesInfo(@RequestParam("id") int id){
        Classes classesByTeacher = classesService.getClassesByTeacher(id);
        return classesByTeacher;
    }
}
