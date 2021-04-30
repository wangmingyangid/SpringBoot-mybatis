package org.wmy.mybatis.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.wmy.mybatis.bean.Employee;
import org.wmy.mybatis.service.EmployeeService;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author wmy
 * @create 2021-04-29 13:14
 */

@RestController
public class EmpTestController {
    @Resource
    private EmployeeService service;

    @GetMapping("/emp/{id}")
    public Employee getEmpById(@PathVariable("id") int id){
        return service.getEmpById(id);
    }

    @GetMapping("/empMap")
    public Employee getEmpByMap(){
        return service.getEmpByMap();
    }

    @GetMapping("/empList")
    public List<Employee> getEmpList(){
        return service.getEmpList();
    }
    @GetMapping("/empToMap")
    public Map<String, Object> getEmpToMap(){
        return service.getEmpToMap();
    }

    @GetMapping("/getEmps")
    public Map<Integer, Employee> getEmps(){
        return service.getEmps();
    }

}
