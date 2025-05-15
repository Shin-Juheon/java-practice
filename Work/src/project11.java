import java.util.Scanner;

public class project11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        for (;;) {
            System.out.println("1부터 100 사이의 숫자를 입력하세요: ");
            num = sc.nextInt();

            if (num >= 1 && num <= 100) {
                break;
            }
        }
        System.out.print("입력 완료! 프로그램을 종료합니다.");
    }
}
