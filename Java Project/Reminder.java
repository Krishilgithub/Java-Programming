import java.time.LocalDateTime;

public class Reminder extends Thread {
    private User<? extends Task> user;  // Use User of any subclass of Task
    private int reminderInterval;       // in seconds

    public Reminder(User<? extends Task> user, int reminderInterval) {
        this.user = user;
        this.reminderInterval = reminderInterval;
    }

    @Override
    public void run() {
        try {
            while (true) {
                checkTasks();
                // Sleep for the specified reminder interval (converted to milliseconds)
                Thread.sleep(reminderInterval * 1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Reminder thread interrupted.");
        }
    }

    // Check for tasks whose deadlines are within the next hour
    private void checkTasks() {
        LocalDateTime now = LocalDateTime.now();
        for (Task task : user.tasks) {  // We are sure tasks are of type Task or its subclass
            if (task.getDeadline().isBefore(now.plusHours(1)) && task.getDeadline().isAfter(now)) {
                System.out.println("Reminder: Task '" + task.getTaskName() + "' is due soon at " + task.getFormattedDeadline());
            }
        }
    }
}
