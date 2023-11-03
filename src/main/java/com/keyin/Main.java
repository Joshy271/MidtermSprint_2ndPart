package com.keyin;

import com.keyin.ToDo.User;

public class Main {
    public static void main(String[] args) {
        // Create an array to store users.
        User[] users = new User[10];

        // Example: Create a user and add tasks.
        User user1 = new User("Josh");
        user1.addTask("Finish Midterm Sprint");
        user1.addTask("Catch up on sleep");
        user1.addTask("See a therapist for loss of mind");

        User user2 = new User("Amy");
        user2.addTask("Pick up kids from school");
        user2.addTask("Wash the car");
        user2.addTask("Take the dog for a walk");

        // Mark tasks as completed.
        user1.markTaskAsCompleted(0);

        user2.markTaskAsCompleted(0);
        user2.markTaskAsCompleted(1);

        // Display tasks for each user.
        displayUserTasks(user1);
        displayUserTasks(user2);

        // Store the user in the array.
        users[0] = user1;
        users[1] = user2;

        // Repeat the above steps for additional users.
    }

    public static void displayUserTasks(User user) {
        System.out.println("User: " + user.getName());
        user.viewTasks();
        System.out.println(); // Add an extra space for readability
    }
}
