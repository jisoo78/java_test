package java_four;

public class Student extends Person {
    private int score;

    public Student(String name, int score) {
        super(name);
        this.score = score;
    }

    @Override
    void printName() {
        System.out.println("학생이름: " + name);
        System.out.println("점수 : " + score);
    }
}
