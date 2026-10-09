package test;

import model.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MainTest {
    public static void main(String[] args) {
        // create employees
        MonthlyEmployee manager = new MonthlyEmployee(1, "Ahmed Ali", Gender.MALE,
                LocalDate.of(2018, 3, 15), 15000, 21, 10, true);
        HourlyEmployee hourly = new HourlyEmployee(2, "Sara Hassan", Gender.FEMALE,
                LocalDate.of(2022, 6, 1), 100, 45, 150);
        CommissionEmployee sales = new CommissionEmployee(3, "Omar Khaled", Gender.MALE,
                LocalDate.of(2021, 1, 10), 5000, 0.05, 80000);

        // create department
        List<Employee> list = new ArrayList<>();
        list.add(manager);
        list.add(hourly);
        Department dept = new Department(10, "Sales", manager, list);
        dept.addEmployee(sales);

        System.out.println(dept);
        System.out.println();
        dept.printAllEmployees();
        System.out.println();

        System.out.println("Commission of Omar: " + sales.calculateCommission());
        System.out.println("Extra vacation for Ahmed: " + manager.calculateAdditionalVacation());
        System.out.println("Total payroll: " + dept.calculateTotalPayroll());
        System.out.println();

        // find and remove
        System.out.println("Find employee 2: " + dept.findEmployee(2).getName());
        dept.removeEmployee(2);
        System.out.println("Find employee 2 after remove: " + dept.findEmployee(2));
        System.out.println("Total payroll now: " + dept.calculateTotalPayroll());
    }
}
