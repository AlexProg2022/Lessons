package lesson5.firstPart;

public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void eat(){
        System.out.println("I'am eating...");
    }
    public void makeSound(){
        System.out.println("Sound");
    }



}