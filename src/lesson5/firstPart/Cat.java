package lesson5.firstPart;

public class Cat extends Animal {
    int liveCount;

    public Cat(String name, int age, int liveCount) {
        super(name, age);
        this.liveCount = liveCount;
    }

    public int getLiveCount() {
        return liveCount;
    }

    public void setLiveCount(int liveCount) {
        this.liveCount = liveCount;
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Мяу-мяу");
    }
}


