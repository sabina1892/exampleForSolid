package org.example;

import org.example.dependencyInjection.CustomerInformation;
import org.example.dependencyInjection.ProductDelivering;
import org.example.dependencyInjection.ProductInformation;
import org.example.interfaceSegregation.Price;
import org.example.interfaceSegregation.Stock;
import org.example.liskov.CashierLiskov;
import org.example.liskov.Driver;
import org.example.openClosed.Cashier;
import org.example.singleResponsibility.Employee;
import org.example.singleResponsibility.Salary;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee("Sam",800);
        Salary salary = new Salary();
        System.out.println(salary.calculateSalary(employee));

        new Cashier().jobDescription();

        new Driver().work();

        new Stock().delete();
        new Stock().update();
        new Price().update();

        ProductInformation pi = new ProductDelivering();
        new CustomerInformation(pi).displayInformation();
    }
}