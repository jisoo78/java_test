package java_three;

public class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    void printName() {
        System.out.println("이름: " + name);
    }
}
