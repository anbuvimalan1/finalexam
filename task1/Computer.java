package finalexam.task1;

public class Computer {

    private String brand;
    private int memory;
    private int ssd;
    private int hdd;

    // Constructor
    public Computer(String brand, int memory, int ssd, int hdd) {
        this.brand = brand;
        this.memory = memory;
        this.ssd = ssd;
        this.hdd = hdd;
    }

    // Getters and Setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getSsd() {
        return ssd;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    // Override toString() method
    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", memory=" + memory +
                "GB, ssd=" + ssd +
                "GB, hdd=" + hdd +
                "GB}";
    }

    // Example usage in main method
    public static void main(String[] args) {
        Computer myComputer = new Computer("Dell", 16, 512, 2000);
        System.out.println(myComputer); // Calls toString() implicitly
    }
}
