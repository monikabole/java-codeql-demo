public class VulnerableExample {
    public static void main(String[] args) {
        // Hardcoded password - this should trigger a CodeQL alert
        String password = "admin123";
        System.out.println("Password is: " + password);
    }
}

