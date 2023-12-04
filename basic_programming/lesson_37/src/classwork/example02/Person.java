package classwork.example02;

public class Person {
    private String fullName;
    private String passportNumber;
    private Address address;

    public Person(String fullName, String passportNumber, Address address) {
        this.fullName = fullName;
        this.passportNumber = passportNumber;
        this.address = address;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public Address getAdress() {
        return address;
    }

    public void setAdress(Address address) {
        this.address = address;
    }
}
