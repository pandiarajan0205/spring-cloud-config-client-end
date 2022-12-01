package com.demo.clientend.employee;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {

    @Id
    @Column(name="emp_id")
    private Long id;
    @Column(name="emp_name")
    private String empName;
    @Column(name="emp_dept")
    private String empDept;
    @Column(name="emp_sal")
    private Double empSal;

    public Employee() {
    }
    public Employee(Long id, String empName, String empDept, Double empSal) {
        this.id = id;
        this.empName = empName;
        this.empDept = empDept;
        this.empSal = empSal;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpDept() {
        return empDept;
    }

    public void setEmpDept(String empDept) {
        this.empDept = empDept;
    }

    public Double getEmpSal() {
        return empSal;
    }

    public void setEmpSal(Double empSal) {
        this.empSal = empSal;
    }
}
