//package java_one;
//
//public class Project_8 {
//    /**
//     * 1️⃣ java_one.java_two.Student 클래스
//     * name, score
//     * 생성자
//     * printInfo()
//     * 2️⃣ main
//     * java_one.java_two.Student 객체 3개
//     * 객체 배열에 저장
//     * for문으로 전부 출력
//     * ❌ static 남용 금지
//     * ❌ 객체 없이 값 넣기 금지
//     * ❌ 생성자 안 쓰면 혼남 💢
//     * @param args
//     */
//
//    public static void main(String[] args) {
//        // 객체 생성
////        java_one.java_two.Student student = new java_one.java_two.Student();
//        // 배열 생성
//        java_two.Student[] arrst = new java_two.Student[3];
//        // 배열에 객체값 넣기
//        arrst[0] = new java_two.Student("홍길동", 90);
//        arrst[1] = new java_two.Student("김첨지", 80);
//        arrst[2] = new java_two.Student("이성계", 70);
//
//        for (int i = 0; i < arrst.length; i++) {
//            // printInfo 메소드를 불러와 각 객체의 이름과 점수를 출력할거야
//            arrst[i].printInfo();
//        }
//    }
//}
//// 클래스 생성
//class java_two.Student {
//    String name;
//    int score;
//
//    // 객채를 전달받은 생성자
//    public java_two.Student(String name, int score) {
//        this.name = name;
//        this.score = score;
//    }
//
//
//    // 메소드
//    void printInfo() {
//        System.out.println("이름: " + name);
//        System.out.println("점수: " + score);
//    }
//
//}
