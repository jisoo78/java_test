package java_two;

public class Project_1 {

    public static void main(String[] args) {
        // TODO: 접근제어자와 get.set 의 개념을 알자
        Student student = new Student("홍길동",90);
        // 이름은 읽기만 가능하고 점수는 set 만 주어 조건문에 규칙을 지킨다면 원하는 값을 출력할 수 있음
        student.setScore(-90);
        student.setScore(100);
        student.printInfo();

        // name, score 를 private 접근제어자로 감싸 접근할 수 없음
//        arrst[0].name = "test";

    }
}
