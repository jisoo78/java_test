package mini_project;

public class Student extends Person{
    private int score;

    public Student(String name, int score) {
        super(name);
        this.score = score;
    }

    @Override
    void printInfo() {
        System.out.println("학생 이름: " + name);
        System.out.println("점수: " + score);
    }
}
