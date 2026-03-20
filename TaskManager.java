import java.util.*;

public class TaskManager {
    public static void main(String[] args) {

        Stack<String> undoStack = new Stack<>();
        Queue<String> taskQueue = new LinkedList<>();

        // Add tasks
        taskQueue.add("Design UI");
        taskQueue.add("Write Code");
        taskQueue.add("Test App");

        System.out.println("Processing Tasks:");

        while (!taskQueue.isEmpty()) {
            String task = taskQueue.poll();
            System.out.println("Completed: " + task);
            undoStack.push(task);
        }

        System.out.println("\nUndo Last Task:");
        if (!undoStack.isEmpty()) {
            System.out.println("Undo: " + undoStack.pop());
        }
    }
}