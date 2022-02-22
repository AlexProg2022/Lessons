package lesson5.fourthPath;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();
        Dog dog = new Dog();
        test(cat);
        test(dog);
        test(animal);
    }
    public static void test(Animal animal){
        animal.eat();
    }
}
