public class Project_4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("========구분선==========");
        for (int j = 1; j <= 10; j++) {
            if (j % 2 == 0) {
                System.out.println(j);
            }
        }
        System.out.println("==========구분선==========");
        for (int k = 10; k >= 1; k--) {
            System.out.println(k);
        }
    }
}
