public class Cat extends Animal {
    @Override
    public void animalSound() {
        System.out.println("Meow");
    }

    @Override
    public void eat(){
        System.out.println("eating cat food");
    }
}
