package finalexam.task3;

import java.io.*;
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

    // Method to save the staff list to a file
    public void saveStaffToFile(String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(staff);
            System.out.println("Staff list saved to " + fileName);
        } catch (IOException e) {
            System.err.println("Error saving staff list to file: " + e.getMessage());
        }
    }

    // Method to load the staff list from a file
    public void loadStaffFromFile(String fileName) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            staff = (List<Person>) ois.readObject();
            System.out.println("Staff list loaded from " + fileName);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error loading staff list from file: " + e.getMessage());
        }
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

        // Add persons to the factory staff
        factory.addPerson(emp1);
        factory.addPerson(emp2);

        // Save staff list to a file
        factory.saveStaffToFile("staff.dat");

        // Clear staff list (for demonstration purposes)
        factory.getStaff().clear();

        // Load staff list from file
        factory.loadStaffFromFile("staff.dat");

        // Display current staff
        System.out.println("\nLoaded Staff:");
        for (Person person : factory.getStaff()) {
            System.out.println(person.getName() + " " + person.getSurname());
        }
    }
}
