
package com.cg.springmvcone.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.springmvcone.dao.IEmployeeDAO;
import com.cg.springmvcone.dto.Employee;

@Service("employeeservice")
@Transactional
public class EmployeeServiceImpl implements IEmployeeService {
                
                
                @Autowired
                IEmployeeDAO employeedao;
                @Override
                public int addEmployeeData(Employee emp) {
                                
                                return employeedao.addEmployeeData(emp);
                }

                @Override
                public List<Employee> showAllEmployee() {
                                
                                return employeedao.showAllEmployee();
                }

                @Override
                public void deleteEmployee(int empId) {
                               
                              employeedao.deleteEmployee(empId);

                }

                @Override
                public boolean updateEmployee(Employee emp) {
                               
                          return employeedao.updateEmployee(emp);
                }

                @Override
                public Employee searchEmployee(int empId) {
                                
                                return employeedao.searchEmployee(empId);
                                
                }

				

}
