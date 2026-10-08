import java.util.ArrayList;

public class WorkoutManager {

    private ArrayList<Workout> workouts;

    public WorkoutManager() {
        workouts = new ArrayList<>();
    }

    public void addWorkout(Workout workout) {
        workouts.add(workout);
    }

    public void viewWorkouts() {
        if(workouts.isEmpty()) {
            System.out.println("No workouts recorded.");
            return;
        }

        for(Workout w : workouts) {
            System.out.println(w);
        }
    }

    public ArrayList<Workout> getWorkouts() {
        return workouts;
    }
}