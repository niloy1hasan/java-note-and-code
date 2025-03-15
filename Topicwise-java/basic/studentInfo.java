public class studentInfo {
    public static void main(String[] args){
        Student student = new Student("Niloy Hasan Nahid", 350, "Computer Science And Engineering", 'I');

        String name = student.getName();
        System.out.println("Name: " + name);

        student.studentDetail();
    }
}
