package model;

import java.time.LocalDate;

public class MonthlyEmployee extends Employee {
    private double monthlySalary;
    private int vacationDays;
    private double bonusPercentage;
    private boolean hasHealthInsurance;

    public MonthlyEmployee(int id, String name, Gender gender, LocalDate hireDate,
                           double monthlySalary, int vacationDays,
                           double bonusPercentage, boolean hasHealthInsurance) {
        super(id, name, gender, hireDate);
        this.monthlySalary = monthlySalary;
        this.vacationDays = vacationDays;
        this.bonusPercentage = bonusPercentage;
        this.hasHealthInsurance = hasHealthInsurance;
    }

    public double getMonthlySalary() { return monthlySalary; }
    public int getVacationDays() { return vacationDays; }
    public double getBonusPercentage() { return bonusPercentage; }
    public boolean isHasHealthInsurance() { return hasHealthInsurance; }

    public void setMonthlySalary(double monthlySalary) { this.monthlySalary = monthlySalary; }
    public void setVacationDays(int vacationDays) { this.vacationDays = vacationDays; }
    public void setBonusPercentage(double bonusPercentage) { this.bonusPercentage = bonusPercentage; }
    public void setHasHealthInsurance(boolean hasHealthInsurance) { this.hasHealthInsurance = hasHealthInsurance; }

    // salary = monthly salary + bonus
    public double calculateSalary() {
        double bonus = monthlySalary * bonusPercentage / 100;
        return monthlySalary + bonus;
    }

    // 1 extra vacation day for each year of work
    public int calculateAdditionalVacation() {
        int years = LocalDate.now().getYear() - getHireDate().getYear();
        return years;
    }

    public String toString() {
        return "MonthlyEmployee: " + super.toString() + ", Monthly Salary: " + monthlySalary
                + ", Vacation Days: " + vacationDays + ", Bonus: " + bonusPercentage
                + "%, Health Insurance: " + hasHealthInsurance + ", Salary: " + calculateSalary();
    }
}
