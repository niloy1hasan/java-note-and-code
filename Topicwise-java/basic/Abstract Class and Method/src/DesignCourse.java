public class DesignCourse extends Course {
    DesignCourse(String courseName) {
        super(courseName);
    }

    @Override
    void startCourse() {
        System.out.println("Start Designing course in " + courseName);
    }
}
