package com.example.OfficeManagementApp.Controller;

import com.example.OfficeManagementApp.Model.Employee;
import com.example.OfficeManagementApp.Service.employeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class employeeController {
    @Autowired
    employeeService emp;
    @PostMapping("/add-employee")
    public Employee addEmployee(@RequestBody Employee a){
        return emp.addEmployee(a);
    }
    @GetMapping("/get-employee")
    public Employee getEmployee(@RequestParam("id") int empid){
        return emp.getEmployee(empid);
    }
    @DeleteMapping("/del-employee/{id}")
    public Employee deleteemployee(@PathVariable("id") int empid){
        return emp.deleteemployee(empid);
    }
    @PostMapping("/update-employee")
    public Employee updatesalary(@RequestParam("id") int empid,@RequestParam("sal") int salary){
        return emp.updateSalary(empid,salary);
    }

}
