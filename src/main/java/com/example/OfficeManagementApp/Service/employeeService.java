package com.example.OfficeManagementApp.Service;

import com.example.OfficeManagementApp.Model.Employee;
import com.example.OfficeManagementApp.Repository.employeeReposotiry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class employeeService {
   @Autowired
   employeeReposotiry ser;
   public Employee addEmployee(Employee emp){
      return ser.addEmployee(emp);
   }
   public Employee getEmployee(int id){
      return ser.getEmployee(id);
   }

   public Employee deleteemployee(int empid) {
      return ser.deleteEmployee(empid);
   }

   public Employee updateSalary(int empid, int salary) {
         return  ser.updateSalary(empid,salary);
   }

   public Employee maxSalary() {
      return ser.maxSalary();
   }
}
