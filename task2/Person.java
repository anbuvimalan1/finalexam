package finalexam.task2;

public class Person {
    private String name;
    private String surname;
    private String personalNumber;

    // Constructors
    public Person(String name, String surname, String personalNumber) {
        this.name = name;
        this.surname = surname;
        this.personalNumber = personalNumber;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPersonalNumber() {
        return personalNumber;
    }

    public void setPersonalNumber(String personalNumber) {
        this.personalNumber = personalNumber;
    }

    // Example usage in main method
    public static void main(String[] args) {
        // Create a Person object
        Person person = new Person("John", "Doe", "1234567890");

        // Display information
        System.out.println("Name: " + person.getName());
        System.out.println("Surname: " + person.getSurname());
        System.out.println("Personal Number: " + person.getPersonalNumber());
    }
}

