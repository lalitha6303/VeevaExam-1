import java.util.*;
import java.util.stream.Collectors;

public class PayrollManager {

    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    public Map<String, Double> DeptWiseTotalSalary() {
        return employees.stream()

                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.summingDouble(Employee::CalculateSalary)
                ));

    }


    public List<String> TopEarners(double threshold) {
        return employees.stream()

                .filter(s -> s.CalculateSalary() > threshold)
                .map(Employee::getName)
                .sorted()
                .collect(Collectors.toList());
    }
}

