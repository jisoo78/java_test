package java_four;

public class Application {
    public static void main(String[] args) {
        Person[] person = new Student[2];
        person[0] = new Student("홍길동", 10);
        person[1] = new Student("강감찬", 20);

        for (int i = 0; i < person.length; i++) {
            person[i].printName();
        }

    }
}
