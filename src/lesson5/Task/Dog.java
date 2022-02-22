package lesson5.Task;

public class Dog extends Animal {
    boolean b = false;
    @Override
    public void run(int length) {
        if (length >= 500){
            System.out.println(b);

        }
    }

    @Override
    public void jump(int hight) {
    }


}
