public class Admin extends User {

    // Constructor to initialize Admin with username and password
    public Admin(String username, String password) {
        super(username, password);
    }

    // Admin-specific menu options can be added here
    @Override
    public void displayMenu() {
        System.out.println("Admin Menu:");
        System.out.println("1. View All Tasks");
        System.out.println("2. Add Task");
        System.out.println("3. Remove Task");
        System.out.println("4. Exit");
    }

    // Admin can perform other admin-related actions (extend this later)
}
