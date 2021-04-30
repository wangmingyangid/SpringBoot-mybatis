package org.wmy.mybatis.service;

import org.springframework.stereotype.Service;
import org.wmy.mybatis.bean.Employee;
import org.wmy.mybatis.dao.IEmployeeMapper;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wmy
 * @create 2021-04-29 13:13
 */

@Service
public class EmployeeService {
    @Resource
    private IEmployeeMapper mapper;

    public Employee getEmpById(int id){
        return mapper.getEmpById(id);
    }

    public int updateEmp(){
        Employee employee = new Employee();
        employee.setId(1);
        employee.setEmpName("哇公民");
        return mapper.updateEmployee(employee);
    }

    public boolean deleteEmp(){
        Employee employee = new Employee();
        employee.setId(1);
        return mapper.deleteEmployee(employee);
    }

    public int insertEmp(){
        Employee employee = new Employee();
        employee.setId(1);
        employee.setEmpName("哈哈");
        return mapper.insertEmployee(employee);
    }

    public Employee getEmpByMap(){
        HashMap<String, Object> map = new HashMap<>();
        map.put("table","employee");
        map.put("id",1);
        map.put("name","王弥");
        Employee emp = mapper.getEmpByMap(map);

        return emp;
    }

    public List<Employee> getEmpList(){
        List<Employee> empList = mapper.getEmpList();
        return empList;
    }

    public Map<String, Object> getEmpToMap(){
        Map<String, Object> map = mapper.getEmpByIdReturnMap(1);
        return map;
    }

    public Map<Integer, Employee> getEmps(){
        Map<Integer, Employee> map = mapper.getEmployeesReturnMap();
        return map;
    }
}
