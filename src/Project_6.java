public class Project_6 {
    public static void main(String[] args) {
        // 변수 선언 및 초기화
        int a = 5;
        int b = 10;
        int sum = add(a,b);
        System.out.println(sum);
    }

    // 정수 a,b를 받아 a+b를 리턴해줌
    static int add(int a, int b) {
        return a + b;
    }
}
