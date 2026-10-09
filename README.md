# Employee Management System

**Full Name:** Aya Ehab AbdelTawab
**Student ID:** 2300247

## Description
A simple Java project that implements a UML class diagram for an employee system.
It contains an abstract `Employee` class with three types of employees
(`MonthlyEmployee`, `HourlyEmployee`, `CommissionEmployee`), a `Gender` enum,
and a `Department` class that manages the employees and calculates the total payroll.

## Project Structure
```
src/
├── Main.java
├── model/  (Employee, CommissionEmployee, MonthlyEmployee, HourlyEmployee, Department, Gender)
└── test/   (MainTest.java - demo with sample data)
```

## How to Run
Requires JDK 11 or newer. From the project folder:
```bash
mkdir out
javac -d out src/model/*.java src/test/*.java src/Main.java
java -cp out Main
```
Or open the folder in IntelliJ / Eclipse / VS Code and run `Main.java`.
