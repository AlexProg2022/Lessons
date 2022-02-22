package lesson5.thirdPart;

public class Person implements Info,Move{

    private String name;

    public Person(String name){
        this.name = name;

    }

    public void sayHello (){
        System.out.println();
    }

    @Override
    public void showInfo() {

    }

    @Override
    public void moving() {

    }
}
