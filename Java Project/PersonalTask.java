
import java.time.LocalDateTime;

public class PersonalTask extends Task {

    // Constructor to initialize personal task details
    public PersonalTask(String taskName, String description, LocalDateTime deadline, int priority) {
        super(taskName, description, deadline, priority);
    }

    // Display specific details for personal task
    @Override
    public void displayTaskDetails() {
        System.out.println("Personal Task: " + taskName);
        System.out.println("Description: " + description);
        System.out.println("Deadline: " + getFormattedDeadline());
        System.out.println("Priority: " + priority);
    }
}
