package com.example.Company;

public class Employee {
    int empid;
    String empname;
    String phone;
    String dept;

    public Employee(String empname, int empid, String phone, String dept) {
        this.empname = empname;
        this.empid = empid;
        this.phone = phone;
        this.dept = dept;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}