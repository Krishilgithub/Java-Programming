import java.util.ArrayList;

public abstract class User<T extends Task> {
    private String username;
    private String password;
    protected ArrayList<T> tasks;  // Ensure tasks list is of type T which extends Task

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.tasks = new ArrayList<>();
    }

    public abstract void displayMenu();

    public void addTask(T task) {
        tasks.add(task);
    }

    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i).getTaskName());
            }
        }
    }

    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
        } else {
            System.out.println("Invalid task index.");
        }
    }
}
