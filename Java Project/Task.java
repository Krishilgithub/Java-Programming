import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Task {
    protected String taskName;
    protected String description;
    protected LocalDateTime deadline;
    protected int priority;  // 1 = high, 2 = medium, 3 = low

    // Constructor to initialize task details
    public Task(String taskName, String description, LocalDateTime deadline, int priority) {
        this.taskName = taskName;
        this.description = description;
        this.deadline = deadline;
        this.priority = priority;
    }

    // Abstract method to be implemented by subclasses for task-specific display
    public abstract void displayTaskDetails();

    // Getter for task name (for task list display)
    public String getTaskName() {
        return taskName;
    }

    public LocalDateTime getDeadline() {
        return deadline;
    }    

    // Method to format and display the deadline
    public String getFormattedDeadline() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        return deadline.format(formatter);
    }

    // Getter for priority
    public int getPriority() {
        return priority;
    }
}
