import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class TaskSchedulerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a sample user
        RegularUser user = new RegularUser("john_doe", "password123");

        // Start reminder thread (checks every 30 seconds)
        Reminder reminder = new Reminder(user, 30);
        reminder.start();

        boolean running = true;

        while (running) {
            user.displayMenu();
            try {
                int choice = scanner.nextInt();
                scanner.nextLine();  // Consume newline

                switch (choice) {
                    case 1:
                        user.displayTasks();
                        break;
                    case 2:
                        addTask(user, scanner);
                        break;
                    case 3:
                        removeTask(user, scanner);
                        break;
                    case 4:
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid option, please try again.");
                }
            } catch (Exception e) {
                System.out.println("Error: Invalid input. Please enter a number.");
                scanner.nextLine();  // Clear the scanner buffer
            }
        }

        scanner.close();
        // Interrupt reminder thread
        reminder.interrupt();
    }

    private static void addTask(User user, Scanner scanner) {
        try {
            System.out.println("Enter task name:");
            String taskName = scanner.nextLine();

            System.out.println("Enter task description:");
            String description = scanner.nextLine();

            System.out.println("Enter task priority (1 = high, 2 = medium, 3 = low):");
            int priority = scanner.nextInt();

            System.out.println("Enter deadline (format: YYYY-MM-DD HH:MM):");
            scanner.nextLine();  // Consume newline
            String deadlineStr = scanner.nextLine();
            LocalDateTime deadline = LocalDateTime.parse(deadlineStr, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));

            // For simplicity, add a WorkTask
            Task task = new WorkTask(taskName, description, deadline, priority);
            user.addTask(task);
            System.out.println("Task added!");
        } catch (DateTimeParseException e) {
            System.out.println("Error: Invalid date format. Please use the format YYYY-MM-DD HH:MM.");
        } catch (Exception e) {
            System.out.println("Error: Invalid input.");
        }
    }

    private static void removeTask(User user, Scanner scanner) {
        try {
            System.out.println("Enter the task number to remove:");
            int taskIndex = scanner.nextInt() - 1;
            user.removeTask(taskIndex);
            System.out.println("Task removed!");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: Invalid task index.");
        }
    }
}
