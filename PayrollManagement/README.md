# Payroll Management System

## Problem Statement

Design and implement a Payroll Management System for an organization that has different types of employees.

The system uses an abstract `Employee` class and two subclasses, `FullTimeEmployee` and `ContractEmployee`, to calculate salaries based on employee type.

A `PayrollManager` class maintains a list of employees and performs department-wise salary calculations and top-earner identification using Java Streams and Lambda Expressions.

## Class Design

### 1. Employee (Abstract Class)

Contains the following private fields:

- `id` – Employee ID (int).
- `name` – Employee name (String).
- `department` – Employee department (String).

**Methods:**
- Constructor to initialize employee details.
- Getters to access private fields.
- `calculateSalary()` – Abstract method to calculate employee salary.

### 2. FullTimeEmployee (Subclass)

Extends the `Employee` class.

**Additional Attributes:**
- `baseSalary` – Basic salary (double).
- `bonus` – Additional bonus (double).

**Salary Calculation:**

`Salary = baseSalary + bonus`

### 3. ContractEmployee (Subclass)

Extends the `Employee` class.

**Additional Attributes:**
- `hourlyRate` – Payment per hour (double).
- `hoursWorked` – Total hours worked (int).

**Salary Calculation:**

`Salary = hourlyRate * hoursWorked`

### 4. PayrollManager

Maintains a `List<Employee>` and implements the following methods using Java Streams and Lambdas.

**Method 1: getDepartmentWiseTotalSalary()**

Return type: `Map<String, Double>`

- Groups employees based on their department.
- Calculates the total salary payout for each department.
- Uses Java Streams and `Collectors.groupingBy()` with `Collectors.summingDouble()`.

**Method 2: getTopEarners(double threshold)**

Return type: `List<String>`

- Identifies employees whose calculated salary is strictly greater than the given threshold.
- Sorts the employee names in alphabetical order.
- Returns the sorted list of employee names.

## Sample Input

```text
FullTimeEmployee(101, "Alice", "IT", 60000, 10000)
ContractEmployee(102, "Bob", "IT", 500, 100)
FullTimeEmployee(103, "Charlie", "HR", 55000, 5000)

threshold = 55000
```

## Sample Output

```text
Department-wise Total Salary: {IT=120000.0, HR=60000.0}

Top Earners (> 55000): [Alice, Charlie]
```

## Concepts Used

- Abstract Classes
- Inheritance
- Encapsulation
- Method Overriding
- Runtime Polymorphism
- ArrayList and List
- Java Streams API
- Lambda Expressions
- Collectors.groupingBy()
- Collectors.summingDouble()
- Filtering and Sorting
- Map and List Collections

## Approach

1. Create an abstract `Employee` class with private fields and an abstract `calculateSalary()` method.
2. Create `FullTimeEmployee` and `ContractEmployee` subclasses.
3. Override `calculateSalary()` in both subclasses according to their salary calculation rules.
4. Create a `PayrollManager` class to maintain employee records.
5. Implement department-wise salary calculation using Java Streams and Collectors.
6. Implement top-earner identification using filtering and alphabetical sorting.
7. Display department-wise salary totals and the list of top earners.




## Project Files

- `Employee.java` – Abstract employee class.
- `FullTimeEmployee.java` – Full-time employee implementation.
- `ContractEmployee.java` – Contract employee implementation.
- `PayrollManager.java` – Payroll processing using Streams and Lambdas.
- `Main.java` – Main class to execute and test the application.
