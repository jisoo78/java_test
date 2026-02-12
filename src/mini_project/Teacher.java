package mini_project;

public class Teacher extends Person{
    private String subject;

    public Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    @Override
    void printInfo() {
        System.out.println("선생님 이름: " + name);
        System.out.println("과목: " + subject);
    }
}
