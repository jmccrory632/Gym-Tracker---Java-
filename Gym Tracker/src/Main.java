import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        WorkoutManager manager = new WorkoutManager();

        boolean running = true;

        while(running) {

            System.out.println("\n=== Gym Tracker ===");
            System.out.println("1. Add Workout");
            System.out.println("2. View Workouts");
            System.out.println("3. Exit");
            System.out.print("Choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {

                case 1:

                    System.out.print("Exercise: ");
                    String exercise = scanner.nextLine();

                    System.out.print("Weight (kg): ");
                    double weight = scanner.nextDouble();

                    System.out.print("Reps: ");
                    int reps = scanner.nextInt();

                    manager.addWorkout(
                            new Workout(exercise, weight, reps)
                    );

                    System.out.println("Workout Added!");
                    break;

                case 2:
                    manager.viewWorkouts();
                    break;

                case 3:
                    running = false;
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid Choice: Try again please!");
            }
        }
    }
}