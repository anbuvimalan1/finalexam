package finalexam.task3;

public class FactoryTester {

    public static void main(String[] args) {
        // Create a PaperFactory instance
        PaperFactory factory = new PaperFactory();

        // Create Person objects
        Person emp1 = new Person("John", "Doe", "1234567890");
        Person emp2 = new Person("Jane", "Smith", "0987654321");

        // Add persons to the factory staff
        factory.addPerson(emp1);
        factory.addPerson(emp2);

        // Display current staff
        System.out.println("\nCurrent Staff:");
        for (Person person : factory.getStaff()) {
            System.out.println(person.getName() + " " + person.getSurname());
        }

        // Delete a person from the factory staff
        factory.deletePerson(emp1);

        // Display updated staff
        System.out.println("\nUpdated Staff:");
        for (Person person : factory.getStaff()) {
            System.out.println(person.getName() + " " + person.getSurname());
        }
    }
}

