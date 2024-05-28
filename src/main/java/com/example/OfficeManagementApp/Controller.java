package com.example.OfficeManagementApp;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class Controller {
    HashMap<Integer,Employee> map = new HashMap<>();
    @PostMapping("/add-employee")
    public String addEmployee(@RequestBody Employee a){
        map.put(a.getEmpid(),a);
        return "added";
    }
    @GetMapping("/get-employee")
    public Employee getEmployee(@RequestParam("id") int empid){
        return map.get(empid);
    }
    @DeleteMapping("/del-employee/{id}")
    public String deleteemployee(@PathVariable("id") int empid){
        map.remove(empid);
        return "deleted";
    }
    @PostMapping("/update-employee")
    public String updatesalary(@RequestParam("id") int empid,@RequestParam("sal") int salary){
        Employee curr = map.get(empid);
        curr.setSalary(salary);
        return "updated my slary";
    }

}
