package java_one;

public class Total_Mini_Project {
    public static void main(String[] args) {
        /*
        * 학생 배열을 만들어라 크기는 3
        * */

        // 정수형 타입의 크기가 3인 배열 생성
        Student_Mini[] arrst = new Student_Mini[3];

        // 객체에 값 담기
        arrst[0] = new Student_Mini("홍길동",100);
        arrst[1] = new Student_Mini("김첨지",90);
        arrst[2] = new Student_Mini("이성계",80);

        for (int i = 0; i < arrst.length; i++) {
            arrst[i].printInfo();
        }

    }
}

class Student_Mini {

    // 필드 생성
    String name;
    int score;
    // 생성자
    public Student_Mini(String name, int score) {
        this.name = name;
        this.score = score;
    }
    // 메소드 생성
    void printInfo() {
        System.out.println("학생명: " + name);
        System.out.println("점수: " + score);
    }
}
