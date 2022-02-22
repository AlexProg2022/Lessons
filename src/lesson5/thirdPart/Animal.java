package lesson5.thirdPart;

public class Animal implements Info,Move{
    private int id;

    public Animal(int id) {
        this.id = id;
    }

    public  void sleep(){
        System.out.println("я сплю");
    }

    @Override
    public void showInfo() {

    }

    @Override
    public void moving() {

    }
}
