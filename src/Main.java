import java.time.Month;

public class Main {
    public static void main(String[] args) {
        Birthday birthday = new Birthday(1984, Month.JUNE, 3);
        Address address = new Address(45130, "Essen", "Cornelia", 2);
        Address address2 = new Address(45122, "Essen", "Cornelia", 99);
        EmployeeID e1 = new EmployeeID("rey", "oze", address, birthday, SecurityAccessLevel.LEVEL_1);
        System.out.println(e1);
        e1.setAddress(address2);
        System.out.println(e1);

        Birthday birthday1 = new Birthday(1997, Month.DECEMBER, 25);
        EmployeeID e2 = new EmployeeID("mi", "nour", address, birthday1, SecurityAccessLevel.LEVEL_4);
        System.out.println(e2);

        SecuritySystem securitySystem = new SecuritySystem();
        securitySystem.addEmployee(e1);
        securitySystem.addEmployee(e2);

        System.out.println(securitySystem.isEmployee(e1));
        System.out.println(securitySystem.getEmployeeByUID(2));

        SecuritySystem s1 = new SecuritySystem();
        s1.addEmployee(e1);
        s1.addEmployee(e2);

        System.out.println(s1.getEmployeeByUID(2));

        s1.addArea("Büro", SecurityAccessLevel.LEVEL_3);

        System.out.println(s1.hasAccess(e1, "Büro"));
        System.out.println(s1.hasAccess(e2, "Büro"));
    }
}
