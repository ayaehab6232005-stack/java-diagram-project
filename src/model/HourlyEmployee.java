package model;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {
    private double hourlyRate;
    private double hoursWorked;
    private double overtimeRate;

    public HourlyEmployee(int id, String name, Gender gender, LocalDate hireDate,
                          double hourlyRate, double hoursWorked, double overtimeRate) {
        super(id, name, gender, hireDate);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
        this.overtimeRate = overtimeRate;
    }

    public double getHourlyRate() { return hourlyRate; }
    public double getHoursWorked() { return hoursWorked; }
    public double getOvertimeRate() { return overtimeRate; }

    public void setHourlyRate(double hourlyRate) { this.hourlyRate = hourlyRate; }
    public void setHoursWorked(double hoursWorked) { this.hoursWorked = hoursWorked; }
    public void setOvertimeRate(double overtimeRate) { this.overtimeRate = overtimeRate; }

    // first 40 hours use hourlyRate, the rest use overtimeRate
    public double calculateSalary() {
        if (hoursWorked > 40) {
            double overtime = hoursWorked - 40;
            return 40 * hourlyRate + overtime * overtimeRate;
        } else {
            return hoursWorked * hourlyRate;
        }
    }

    public String toString() {
        return "HourlyEmployee: " + super.toString() + ", Hourly Rate: " + hourlyRate
                + ", Hours Worked: " + hoursWorked + ", Overtime Rate: " + overtimeRate
                + ", Salary: " + calculateSalary();
    }
}
