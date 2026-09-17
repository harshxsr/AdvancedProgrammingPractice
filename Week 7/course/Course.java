package course;
public class Course {
    String courseName; int duration;
    public Course(String courseName, int duration) {
        this.courseName = courseName; this.duration = duration;
    }
    public void display() {
        System.out.println("Course: " + courseName + " | Duration: " + duration + " yrs");
    }
}