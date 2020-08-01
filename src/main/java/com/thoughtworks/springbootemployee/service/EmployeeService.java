package com.thoughtworks.springbootemployee.service;

import com.thoughtworks.springbootemployee.Dto.EmployeeRequest;
import com.thoughtworks.springbootemployee.Dto.EmployeeResponse;
import com.thoughtworks.springbootemployee.entity.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface EmployeeService {
    List<EmployeeResponse> getEmployees();

    EmployeeResponse getSpecificEmployee(int id);

    EmployeeResponse addEmployees(EmployeeRequest employeeRequest);

    void deleteEmployees(int id);

    List<EmployeeResponse> getEmployeesByGender(String gender);

    void updateEmployees(Employee employee);

    List<EmployeeResponse> pagingQueryEmployees(Pageable pageable);
}
