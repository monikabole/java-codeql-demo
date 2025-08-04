public class SQLInjectionVuln {
    public static void main(String[] args) {
        String userInput = "' OR '1'='1";
        String query = "SELECT * FROM users WHERE username = '" + userInput + "'";
        System.out.println("Query: " + query);
    }
}
