package oop.inflexible;

import oop.flexible.Employee;

/* 평사원 클래스 */
public class MereClerk extends Employee {
    public MereClerk (String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    
    public void manageSalary(double rate) {
        salary = salary+ salary*(rate/100);
    }
}
