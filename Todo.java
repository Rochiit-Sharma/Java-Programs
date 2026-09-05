import java.util.ArrayList;

public class Todo {

    public static void main(String[] args) {

        ArrayList<String> tasks = new ArrayList<>();

        // Add tasks
        tasks.add("Complete Java Assignment");
        tasks.add("Study for CAO");
        tasks.add("Go to Gym");

        // Display tasks using StringBuffer
        StringBuffer taskList = new StringBuffer();

        for (String task : tasks) {
            taskList.append(task).append("\n");
        }

        System.out.println("To-Do List:");
        System.out.println(taskList);
    }
}