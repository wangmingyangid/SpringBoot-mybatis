package org.wmy.mybatis.service;

import org.springframework.stereotype.Service;
import org.wmy.mybatis.bean.Teacher;
import org.wmy.mybatis.dao.ITeacherMapper;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author wmy
 * @create 2021-04-29 16:23
 */

@Service
public class TeacherService {

    @Resource
    private ITeacherMapper mapper;

    public List<Teacher> getTeacherByCondition(){
        Teacher teacher = new Teacher();
        teacher.setId(1);
       // teacher.setName("%明%");
        List<Teacher> list = mapper.getTeacherByCondition(teacher);
        return list;
    }

    public List<Teacher> getTeacherByIn(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        return mapper.getTeacherByIn(list);
    }

    public List<Teacher> choose(){
        Teacher teacher = new Teacher();
        teacher.setName("明天");
        //teacher.setId(1);
        return mapper.getTeacherByConditionChoose(teacher);
    }
    public int updateInSelective(){
        Teacher teacher = new Teacher();
        teacher.setName("明天");
        teacher.setId(1);
        return mapper.updateInSelective(teacher);
    }

    public void insertBatch(){
        ArrayList<Teacher> list = new ArrayList<>();
        list.add(new Teacher("张翰",10));
        list.add(new Teacher("历史",20));
        mapper.insertBatch(list);
    }
}
