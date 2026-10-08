package com.example.sb1.Controller;

import com.example.sb1.Model.Employee;
import com.example.sb1.Repository.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {
    @Autowired
    EmpRepo employeeRepository;

    @RequestMapping("/")
    public String home(){
        return "index";
    }

    @RequestMapping("/addEmp")
    public String createEmployee(Employee employee){
        employeeRepository.save(employee);
        return "index";
    }
}
