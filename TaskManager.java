import java.util.Scanner;

public class TaskManager {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Day 1: Task Manager");
        System.out.print("Enter task name: ");
        String name = input.nextLine();
        System.out.println("You added: " + name);
        input.close();
    }
}