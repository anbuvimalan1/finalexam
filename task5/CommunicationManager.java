package finalexam.task5;

public class CommunicationManager {

    private String endpoint;

    // Constructor
    public CommunicationManager(String endpoint) {
        this.endpoint = endpoint;
    }

    // Method to send user message via mock POST request
    public String sendUserMessage(String message) {
        // Simulating a mock response for testing
        String mockResponse = "{ \"response\": \"Mock response for message: " + message + "\" }";
        return mockResponse;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Example usage
        String endpoint = "http://example.com/api/chatbot"; // Replace with your actual endpoint
        CommunicationManager manager = new CommunicationManager(endpoint);

        String userMessage = "Hello, chatbot!";
        String response = manager.sendUserMessage(userMessage);

        System.out.println("Response from server: " + response);
    }
}

