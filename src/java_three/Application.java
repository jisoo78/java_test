package java_three;

public class Application {
    public static void main(String[] args) {
        Student student = new Student("홍길동",90);
        Person person = new Person("강감찬");
        person.printName(); // Person 클래스에서 호출한 printName 메소드
        student.printName();    // Student 클래스에서 호출한 오버라이딩 printName 메소드
    }
}
