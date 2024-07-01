package finalexam.task4;

public class SoftwareDevelopmentCompany implements LegalEntity {

    // Instance variables
    private String address;
    private String vatNumber;

    // Constructor
    public SoftwareDevelopmentCompany(String address, String vatNumber) {
        this.address = address;
        this.vatNumber = vatNumber;
    }

    // Implementing methods from LegalEntity interface
    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public String getVatNumber() {
        return vatNumber;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Creating an instance of SoftwareDevelopmentCompany
        SoftwareDevelopmentCompany myCompany = new SoftwareDevelopmentCompany("123 Main St, City, Country", "123456789");

        // Example usage
        System.out.println("Company Address: " + myCompany.getAddress());
        System.out.println("Company VAT Number: " + myCompany.getVatNumber());
    }
}
