package lesson5.Task;

public class Cat extends Animal {
    boolean a = false;
    @Override
    public void run(int length) {
        if (length >= 200){
            System.out.println(a);

        }
    }

    @Override
    public void jump(int hight) {
        if (hight >= 2){
            System.out.println(a);

        }else
            System.out.println(!a);
    }


}
