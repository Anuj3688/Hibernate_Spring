package org.springorm.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Employee {
    @Id
    @Column(name = "EmployeeID")
    private int id;
    @Column(name = "EmployeeName")
    private String name;
    @Column(name = "EmployeSalary")
    private String salary;
}
