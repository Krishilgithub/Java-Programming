import java.time.LocalDateTime;

public class WorkTask extends Task {

    // Constructor to initialize work task details
    public WorkTask(String taskName, String description, LocalDateTime deadline, int priority) {
        super(taskName, description, deadline, priority);
    }

    // Display specific details for work task
    @Override
    public void displayTaskDetails() {
        System.out.println("Work Task: " + taskName);
        System.out.println("Description: " + description);
        System.out.println("Deadline: " + getFormattedDeadline());
        System.out.println("Priority: " + priority);
    }
}
