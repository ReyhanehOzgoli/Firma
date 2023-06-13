import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class SecuritySystem {

    private Collection<EmployeeID> employees;
    private Map<String, SecurityAccessLevel> accessLevels;

    public SecuritySystem() {
        employees = new ArrayList<>();
        accessLevels = new HashMap<>();
    }

    void addEmployee(EmployeeID employee) {
        employees.add(employee);
    }

    void removeEmployee(EmployeeID employee) {
        employees.remove(employee);
    }

    boolean isEmployee(EmployeeID employee) {
        return employees.contains(employee);
    }



    EmployeeID getEmployeeByUID(int UID) {
        for (EmployeeID employee : employees) {
            if (employee.getUID() == UID) {
                return employee;
            }
        }
        return null; // UID not found
    }

    public void addArea(String areaName, SecurityAccessLevel accessLevel) {
        accessLevels.put(areaName, accessLevel);
    }

    public void removeArea(String areaName) {
        accessLevels.remove(areaName);
    }

    public boolean hasAccess(EmployeeID employee, String areaName) {
        SecurityAccessLevel requiredLevel = accessLevels.get(areaName);
        if (requiredLevel == null) {
            // Bereich nicht definiert, Zugang erlauben
            return true;
        }

        SecurityAccessLevel employeeLevel = employee.getAccessLevel();
        return employeeLevel != null && employeeLevel.ordinal() >= requiredLevel.ordinal();
    }
}