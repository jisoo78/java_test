package java_one;

public class Project_7 {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "지수";
        person.score = 90;
        person.printInfo();
    }
}

class Person {
    String name;
    int score;

    void printInfo() {
        System.out.println("이름:" + name);
        System.out.println("점수:" + score);
    }
}
