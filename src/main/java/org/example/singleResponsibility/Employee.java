package org.example.singleResponsibility;

public class Employee {
    private final String name;
    private final double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
    /* aşağıdakı funksiyanı Employee klasında yazdıqda single responsibility prinsibini pozuruq
    mütləq şəkildə ayrıca klasların daxilində funksiyaları yazmalıyıq */
    //public void calculateSalary() {}


}
