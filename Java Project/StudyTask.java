
import java.time.LocalDateTime;

public class StudyTask extends Task {

    // Constructor to initialize study task details
    public StudyTask(String taskName, String description, LocalDateTime deadline, int priority) {
        super(taskName, description, deadline, priority);
    }

    // Display specific details for study task
    @Override
    public void displayTaskDetails() {
        System.out.println("Study Task: " + taskName);
        System.out.println("Description: " + description);
        System.out.println("Deadline: " + getFormattedDeadline());
        System.out.println("Priority: " + priority);
    }
}
