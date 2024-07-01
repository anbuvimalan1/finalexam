package finalexam.task2;

import java.util.ArrayList;
import java.util.List;

public class PaperFactory {
    private List<Person> staff = new ArrayList<>();

    // Method to add a person to the staff
    public void addPerson(Person p) {
        staff.add(p);
        System.out.println(p.getName() + " " + p.getSurname() + " added to the staff.");
    }

    // Method to delete a person from the staff
    public boolean deletePerson(Person p) {
        boolean removed = staff.remove(p);
        if (removed) {
            System.out.println(p.getName() + " " + p.getSurname() + " removed from the staff.");
        } else {
            System.out.println("Person not found in the staff.");
        }
        return removed;
    }

    // Getter for staff list (optional)
    public List<Person> getStaff() {
        return staff;
    }

    // Example usage in main method
    public static void main(String[] args) {
        // Create a PaperFactory instance
        PaperFactory factory = new PaperFactory();

        // Create Person objects
        Person emp1 = new Person("John", "Doe", "1234567890");
        Person emp2 = new Person("Jane", "Smith", "0987654321");

        // Add persons to the staff
        factory.addPerson(emp1);
        factory.addPerson(emp2);

        // Display current staff
        System.out.println("\nCurrent Staff:");
        List<Person> currentStaff = factory.getStaff();
        for (Person person : currentStaff) {
            System.out.println(person.getName() + " " + person.getSurname());
        }

        // Delete a person from the staff
        factory.deletePerson(emp1);

        // Display updated staff
        System.out.println("\nUpdated Staff:");
        currentStaff = factory.getStaff();
        for (Person person : currentStaff) {
            System.out.println(person.getName() + " " + person.getSurname());
        }
    }
}
