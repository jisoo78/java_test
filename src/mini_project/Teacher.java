package mini_project;

public class Teacher extends Person{
    private int score;

    public Teacher(String name, int score) {
        super(name);
        this.score = score;
    }

    @Override
    void printName() {
        super.printName();
        System.out.println("점수: " + score);
    }
}
