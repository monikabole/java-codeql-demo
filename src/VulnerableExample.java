public class VulnerableExample {
    public static void main(String[] args) {
        String userInput = System.console().readLine();
        System.out.printf(userInput); // Vulnerable: uncontrolled format string
    }
}
