package employeeCategories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeManager {
	private Map<String, List<Employee>> employeeCategories;

    public EmployeeManager() {
        employeeCategories = new HashMap<>();
    }
    public void hireEmployee(String category, Employee employee) throws DuplicateEmployeeException {
        List<Employee> employees = employeeCategories.computeIfAbsent(category, k -> new ArrayList<>());

        for (Employee emp : employees) {
            if (emp.getEmployeeId() == employee.getEmployeeId()) {
                throw new DuplicateEmployeeException("Employee with ID " + employee.getEmployeeId() + " already exists in " + category);
            }
        }

        employees.add(employee);
        System.out.println("Hired " + employee.getName() + " as " + category);
    }

    public void fireEmployee(String category, int employeeId) {
        
        if (employeeCategories.containsKey(category)) {
            List<Employee> employees = employeeCategories.get(category);
            for (Employee employee : employees) {
                if (employee.getEmployeeId() == employeeId) {
                    employees.remove(employee);
                    System.out.println("Fired " + employee.getName() + " from " + category);
                    return;
                }
            }
        }
        System.out.println("Employee with ID " + employeeId + " not found in " + category);
    }
    public void updateEmployeeDetails(String category, int employeeId, String newContactInfo) {
        
        if (employeeCategories.containsKey(category)) {
            List<Employee> employees = employeeCategories.get(category);
            for (Employee employee : employees) {
                if (employee.getEmployeeId() == employeeId) {
                    employee.setContactInfo(newContactInfo);
                    System.out.println("Updated contact info for " + employee.getName() + " in " + category);
                    return;
                }
            }
        }
        System.out.println("Employee with ID " + employeeId + " not found in " + category);
    }
    public void assignTask(String category, int employeeId, String task) throws InvalidTaskAssignmentException {
        
        if (employeeCategories.containsKey(category)) {
            List<Employee> employees = employeeCategories.get(category);
            for (Employee employee : employees) {
                if (employee.getEmployeeId() == employeeId) {
                    if (employee instanceof FrontDeskEmployee) {
                        ((FrontDeskEmployee) employee).checkInGuests();
                    } else if (employee instanceof HousekeepingEmployee) {
                        ((HousekeepingEmployee) employee).cleanRoom();
                    } else {
                        throw new InvalidTaskAssignmentException("Cannot assign task to this employee category.");
                    }
                    System.out.println("Assigned task to " + employee.getName() + " in " + category + ": " + task);
                    return;
                }
            }
        }
        System.out.println("Employee with ID " + employeeId + " not found in " + category);
    }

}
