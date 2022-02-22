package lesson5.firstPart;

import lesson3.Mountain;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat("gosha", 12, 5);
        Dog dog = new Dog("kesha", 13);
        dog.eat();

        Mountain everest = new Mountain("Everest", 8000);
        Mountain everest1 = new Mountain("Everest", 8000);
        Mountain elbrus = new Mountain("Elbrus", 5800);

        System.out.println(everest.equals(everest1));



    }
}

