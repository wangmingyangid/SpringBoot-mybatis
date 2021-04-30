package org.wmy.mybatis.dao;

import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;
import org.wmy.mybatis.bean.Employee;

import java.util.List;
import java.util.Map;

/**
 * @author wmy
 * @create 2021-04-29 13:05
 */

public interface IEmployeeMapper {
    Employee getEmpById(Integer id);

    int updateEmployee(Employee employee);

    boolean deleteEmployee(Employee employee);

    int insertEmployee(Employee employee);

    Employee getEmpByIdAndEmpName(@Param("id") Integer id, @Param("name") String empName);

    //该集合里包含了动态传入的表名
    Employee getEmpByMap(Map<String,Object> map);

    List<Employee> getEmpList();

    Map<String,Object> getEmpByIdReturnMap(Integer id);

    @MapKey("id")
    Map<Integer,Employee> getEmployeesReturnMap();

}
