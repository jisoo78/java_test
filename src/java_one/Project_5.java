package java_one;

public class Project_5 {
    public static void main(String[] args) {

        int[] arr = new int[5]; // 배열 선언과 동시에 길이 5 설정
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
//        int[] arr = {10, 20, 30, 40, 50}; 값이 고정이라면 이런 방법도 존재

        // 배열의 값 전부 출력
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // 배열의 합 출력
        int sum = 0;
        for (int j = 0; j < arr.length; j++) {
            sum += arr[j];
        }
        System.out.println(sum);


    }
}
