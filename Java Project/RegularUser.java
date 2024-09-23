public class RegularUser extends User {

    // Constructor to initialize RegularUser with username and password
    public RegularUser(String username, String password) {
        super(username, password);
    }

    // Display menu options for a regular user
    @Override
    public void displayMenu() {
        System.out.println("User Menu:");
        System.out.println("1. View My Tasks");
        System.out.println("2. Add Task");
        System.out.println("3. Remove Task");
        System.out.println("4. Exit");
    }
}
