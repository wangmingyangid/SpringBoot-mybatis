package org.wmy.mybatis.dao;

import org.apache.ibatis.annotations.Param;
import org.wmy.mybatis.bean.Teacher;

import java.util.List;

/**
 * @author wmy
 * @create 2021-04-29 16:09
 */
public interface ITeacherMapper {
    List<Teacher> getTeacherByCondition(Teacher teacher);

    List<Teacher> getTeacherByIn(@Param("ids")List<Integer> ids);

    List<Teacher> getTeacherByConditionChoose(Teacher teacher);

    int updateInSelective(Teacher teacher);

    void insertBatch(@Param("teachers")List<Teacher> list);
}
