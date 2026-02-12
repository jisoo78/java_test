package mini_project;

public class Application {
    public static void main(String[] args) {
        Person[] person = new Person[3];

        person[0] = new Student("홍길동", 90);
        person[1] = new Student("김첨지", 80);
        person[2] = new Teacher("이순신","수학");

        for (int i = 0; i < person.length; i++) {
            person[i].printInfo();
        }
    }
}
