package finalexam.task3;

import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private String surname;
    private String personalNumber;

    // Constructor
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

    // Method to display person information
    public void displayInfo() {
        System.out.println("Name: " + name + ", Surname: " + surname + ", Personal Number: " + personalNumber);
    }
}
