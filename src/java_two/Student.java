package java_two;

public class Student {
    // 접근제어자 필드 생성
    private String name;
    private int score;
    // 생성자
    public Student(String name, int score) {
        this.name = name;
        setScore(score);
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        if (score < 0) {
            this.score = 0;
        } else {
            this.score = score;
        }
    }

    // 메소드 생성
    void printInfo() {
        System.out.println("학생명: " + name);
        System.out.println("점수: " + score);
    }
}
