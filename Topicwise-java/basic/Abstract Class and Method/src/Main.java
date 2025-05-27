public class Main{
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.animalSound();
        dog.eat();

        Cat cat = new Cat();
        cat.animalSound();
        cat.eat();
        System.out.println("\n\n");

        ProgrammingCourse programmingCourse = new ProgrammingCourse("Java Programming");
        programmingCourse.enrolled_Student("Niloy");
        programmingCourse.startCourse();
        System.out.println();
        DesignCourse designCourse = new DesignCourse("UI/UX design");
        designCourse.enrolled_Student("Nahid");
        designCourse.startCourse();
    }
}