public class EmployeeID {

    private final String firstName;
    private final String familyName;
    private Address address;
    private final Birthday birthday;
    private static int UID;
    private SecurityAccessLevel accessLevel;




    public EmployeeID(String firstName, String familyName, Address address, Birthday birthday, SecurityAccessLevel accessLevel) {
        UID++;
        this.firstName = firstName;
        this.familyName = familyName;
        this.address = address;
        this.birthday = birthday;
        this.accessLevel = accessLevel;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public Address getAddress() {
        return address;
    }

    public Birthday getBirthday() {
        return birthday;
    }

    public SecurityAccessLevel getAccessLevel() { return accessLevel; }

    public int getUID() {
        return UID;
    }

    @Override
    public String toString() {
        return "EmployeeID{" +
                "UID='" + UID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", familyName='" + familyName + '\'' +
                ", address=" + address +
                ", birthday=" + birthday +
                '}';
    }


}
