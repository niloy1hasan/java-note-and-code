public class Student {
    String name;
    int id;
    String depertment;
    char section;

    public Student(String Name, int Id, String dep, char sect){
        name = Name;
        id = Id;
        depertment = dep;
        section = sect;
    }

    String getName(){
        return name;
    }

    int getId(){
        return id;
    }

    String getDepertment(){
        return depertment;
    }

    char getSection(){
        return section;
    }

    public void studentDetail(){
        System.out.println("Student's name: " + name);
        System.out.println("Student's ID: " + id);
        System.out.println("Depertment: " + depertment);
        System.out.println("Section: " + section);
    }

}
