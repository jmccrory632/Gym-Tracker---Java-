public class Workout {

    private String exercise;
    private double weight;
    private int reps;

    public Workout(String exercise, double weight, int reps) {
        this.exercise = exercise;
        this.weight = weight;
        this.reps = reps;
    }

    public String getExercise() {
        return exercise;
    }

    public double getWeight() {
        return weight;
    }

    public int getReps() {
        return reps;
    }

    @Override
    public String toString() {
        return exercise + " - " + weight + "kg x " + reps;
    }
}