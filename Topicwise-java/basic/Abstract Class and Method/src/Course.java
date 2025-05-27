public abstract class Course {
    String courseName;

    //constructor
    Course(String courseName){
        this.courseName = courseName;
        System.out.println("Course created : " + courseName);
    }

    //regular method
    void enrolled_Student(String studentName){
        System.out.println(studentName + " has enrolled in " + courseName);
    }

    //abstract method
    abstract void startCourse();
}
