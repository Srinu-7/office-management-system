package com.example.OfficeManagementApp.Repository;

import com.example.OfficeManagementApp.Model.Employee;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;

@Repository
public class employeeReposotiry {
    HashMap<Integer, Employee> map = new HashMap<>();
    public Employee addEmployee(@RequestBody Employee emp){
           map.put(emp.getEmpid(),emp);
           return emp;
    }
    public Employee getEmployee(@RequestParam("id") int id){
        return map.get(id);
    }

    public Employee deleteEmployee(int empid) {
        map.remove(empid);
        return null;
    }

    public Employee updateSalary(int empid, int salary) {
        Employee curr = map.get(empid);
        curr.setSalary(salary);
        return curr;
    }

    public Employee maxSalary() {
        int ans = -1;
        int ans_val = -1;
        for(int key : map.keySet()){
            if(map.get(key).getSalary() > ans_val){
                ans_val = map.get(key).getSalary();
                ans = key;
            }
        }
        return map.get(ans);
    }
}
