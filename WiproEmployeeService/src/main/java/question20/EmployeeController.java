package question20;

import question20.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private List<Employee> employeeList = new ArrayList<>();

    // Add new employee
    @PostMapping("/add")
    public String addEmployee(@RequestBody Employee emp) {
        employeeList.add(emp);
        return "Employee added: " + emp.getName();
    }

    // Get all employees
    @GetMapping("/all")
    public List<Employee> getAllEmployees(
            @RequestHeader(value = "X-Gateway-Header", required = false) String header) {
        System.out.println("Gateway Header: " + header);
        return employeeList;
    }
}
