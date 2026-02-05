public class project_3 {
    public static void main(String[] args) {

        int score = 80;
        char grade;

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else {
            grade = 'F';
        }

        System.out.println("점수: " + score);
        System.out.println("학점: " + grade);
    }
}
