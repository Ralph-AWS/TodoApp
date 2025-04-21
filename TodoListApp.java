
import java.util.ArrayList;

public class TodoListApp {
    static class Task {
        String description;
        boolean isCompleted;

        Task(String description) {
            this.description = description;
            this.isCompleted = false;
        }

        @Override
        public String toString() {
            return (isCompleted ? "[✔]" : "[ ]") + " " + description;
        }
    }

    public static void main(String[] args) {
        ArrayList<Task> tasks = new ArrayList<>();
        System.out.println("Todo List App Initialized!");
    }
}

