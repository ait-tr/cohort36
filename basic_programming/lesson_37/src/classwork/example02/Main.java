package classwork.example02;

public class Main {

    /*
    Описать классы человек и домашний адрес
    У человека должен быть адрес проживания
     */
    public static void printPersonAddress(Person person) {
        System.out.println(person.getFullName() + " is living at "
                + person.getAdress().getStreet() + " " + person.getAdress().getHouseNumber()
                + ", " + person.getAdress().getPostalCode() + " " + person.getAdress().getCity()
                + ", " + person.getAdress().getCountry());
    }

    public static void main(String[] args) {
        //Stierstraße 20A, 12159 Berlin, Germany
        Address address = new Address("Germany", "Berlin", "Stierstraße", "20A", 12159);
        Person john = new Person("John Doe", "49685496841964", address);
        Person mary = new Person("Mary Doe", "56498419816846", address);
        Person jack = new Person("Jack Doe", "45594987874546", address);
        printPersonAddress(john);
        printPersonAddress(mary);
        printPersonAddress(jack);
    }
}
