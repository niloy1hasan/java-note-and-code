public class ProgrammingCourse extends Course {
    ProgrammingCourse(String courseName) {
        super(courseName);
    }

    @Override
    void startCourse() {
        System.out.println("Start Programming lessons in " + courseName);
    }
}
