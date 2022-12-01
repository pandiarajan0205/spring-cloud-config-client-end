package com.demo.clientend;


import com.demo.clientend.employee.Employee;
import com.demo.clientend.employee.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Configuration
@RefreshScope
@EnableAutoConfiguration
public class IndexController {

    @Autowired
    private EmployeeRepository employeeRepository;


    @Value("${foo}")
    String foo;


    @RequestMapping(value = "/foo")
    public String hi(){
        return foo;
    }

    @RequestMapping("/employee")
    public List<Employee> getList(){
        return employeeRepository.findAll();
    }
}