public class Project_8 {
    /**
     * 1️⃣ Student 클래스
     * name, score
     * 생성자
     * printInfo()
     * 2️⃣ main
     * Student 객체 3개
     * 객체 배열에 저장
     * for문으로 전부 출력
     * ❌ static 남용 금지
     * ❌ 객체 없이 값 넣기 금지
     * ❌ 생성자 안 쓰면 혼남 💢
     * @param args
     */

    public static void main(String[] args) {
        // 객체 배열 선언 및 길이 3 초기화
        Student[] student = new Student[3];
        student[0].name = "홍길동";
        student[1].name = "코카콜라";
        student[2].name = "사이다";

        student[0].score = 90;
        student[1].score = 80;
        student[2].score = 70;

        for (int i = 0; i < student.length; i++) {
            System.out.println(student[i]);
        }

    }
}
// 클래스 생성
class Student {
    String name;
    int score;

    // 생성자
    Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    // 메소드
    void printInfo() {
        System.out.println("이름: " + name);
        System.out.println("점수: " + score);
    }

}
