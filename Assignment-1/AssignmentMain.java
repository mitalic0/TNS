import com.yourname.assignment.employees.Developer;
import com.yourname.assignment.employees.Manager;
import com.yourname.assignment.utilities.EmployeeUtilities;

public class AssignmentMain {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.setName("Mitali Chaudhari");
        manager.setEmployeeId(101);
        manager.setSalary(75000);
        manager.setDepartment("HR");

        Developer developer = new Developer();
        developer.setName("Khushi Vishwakarma");
        developer.setEmployeeId(102);
        developer.setSalary(60000);
        developer.setProgrammingLanguage("Java");

        System.out.println("Manager Details:");
        EmployeeUtilities.printEmployeeDetails(manager);
        System.out.println("Department: " + manager.getDepartment());

        System.out.println("\nDeveloper Details:");
        EmployeeUtilities.printEmployeeDetails(developer);
        System.out.println("Language: " + developer.getProgrammingLanguage());

        // Apply salary increase
        System.out.println("\nApplying 10% salary hike to both employees...\n");
        EmployeeUtilities.increaseSalary(manager, 10);
        EmployeeUtilities.increaseSalary(developer, 10);

        System.out.println("Updated Manager Salary: " + manager.getSalary());
        System.out.println("Updated Developer Salary: " + developer.getSalary());
    }
}
