import java.util.List;

public class Report {
    public static void generatePriorityReport(User<?> user) {
        System.out.println("Tasks sorted by priority:");
        user.tasks.stream()
            .sorted((t1, t2) -> Integer.compare(t1.getPriority(), t2.getPriority()))
            .forEach(task -> System.out.println(task.getTaskName() + " (Priority: " + task.getPriority() + ")"));
    }

    public static void generateDeadlineReport(User<?> user) {
        System.out.println("Tasks sorted by deadline:");
        user.tasks.stream()
            .sorted((t1, t2) -> t1.getDeadline().compareTo(t2.getDeadline()))
            .forEach(task -> System.out.println(task.getTaskName() + " (Deadline: " + task.getFormattedDeadline() + ")"));
    }
}
