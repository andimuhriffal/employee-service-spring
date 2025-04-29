package com.office.employee_service.repository;

import com.office.employee_service.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // Bisa nambah custom query kalau perlu nanti
}
