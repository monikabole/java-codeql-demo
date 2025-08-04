public class SQLInjectionExample {
    public static void main(String[] args) {
        String userInput = "admin";
        String query = "SELECT * FROM users WHERE username = '" + userInput + "'";
        System.out.println("Query: " + query);
    }
}
