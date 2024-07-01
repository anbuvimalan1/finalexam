package finalexam.task1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Notification {

    // Fields
    private String message;
    private LocalDateTime timestamp;

    // Constructor
    public Notification(String message) {
        this.message = message;
        this.timestamp = LocalDateTime.now(); // Initialize with current timestamp
    }

    // Getter for message
    public String getMessage() {
        return message;
    }

    // Getter for timestamp (formatted)
    public String getFormattedTimestamp() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return timestamp.format(formatter);
    }

    // Method to display the notification details
    public void showNotification() {
        System.out.println("Notification at " + getFormattedTimestamp() + ": " + message);
    }

    // Main method to demonstrate Notification class
    public static void main(String[] args) {
        // Create a notification
        Notification notification = new Notification("You have a new message.");

        // Display the notification
        notification.showNotification();
    }
}

