public class Address {

    private int postalCode;
    private String city;
    private String street;
    private int number;

    public Address(int postalCode, String city, String street, int number) {
        this.postalCode = postalCode;
        this.city = city;
        this.street = street;
        this.number = number;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Address{" +
                "postalCode=" + postalCode +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", number=" + number +
                '}';
    }
}
