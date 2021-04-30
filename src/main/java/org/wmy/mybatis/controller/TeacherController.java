package org.wmy.mybatis.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wmy.mybatis.bean.Teacher;
import org.wmy.mybatis.service.TeacherService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wmy
 * @create 2021-04-29 16:28
 */

@RestController
public class TeacherController {
    @Resource
    TeacherService service;

    @GetMapping("getByCondition")
    public List<Teacher> getTeacherByCondition(){
        return service.getTeacherByCondition();
    }

    @GetMapping("selectTeachers")
    public List<Teacher> selectTeachers(){
        return service.getTeacherByIn();
    }

    @GetMapping("/choose")
    public List<Teacher> choose(){
        return service.choose();
    }

    @GetMapping("/updateInSelective")
    public int updateInSelective(){
        return service.updateInSelective();
    }
    @GetMapping("/insertBatch")
    public void insertBatch(){
         service.insertBatch();
    }
}
