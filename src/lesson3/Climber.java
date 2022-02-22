package lesson3;

public class Climber {
    private String fullName;
    private int age;
    private String email;


    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        if (fullName.isEmpty() || fullName.trim().length() < 1){
            throw  new IllegalArgumentException("Значение fullName < 1");
        } else {
            this.fullName = fullName;
        }
    }

    public int getAge() {
        return age;
    }
}
