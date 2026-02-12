package mini_project;

public class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    void printInfo() {
        System.out.println("이름: " + name);
    }
}
