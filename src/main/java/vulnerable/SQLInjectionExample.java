package vulnerable;

public class SQLInjectionExample {
    public String buildQuery(String userInput) {
        return "SELECT * FROM users WHERE username = '" + userInput + "'";
    }

    public static void main(String[] args) {
        SQLInjectionExample app = new SQLInjectionExample();
        String query = app.buildQuery("admin");
        System.out.println("Query: " + query);
    }
}
