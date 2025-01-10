import java.util.ArrayList;
import java.util.List;

class PayrollSystem {
    private List<Employee> employees;

    public PayrollSystem(List<Employee> employees) {
        this.employees = employees != null ? employees : new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void displayEmployee() {
        for (Employee employee : employees) {
            employee.displayDetails();
            System.out.println("Total Salary: " + employee.calculateSalary());
            System.out.println();
        }
    }
}
