import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int total =0;


        while(true) {
            System.out.print("점수를 입력해주세요 (종료하려면 음수를 입력): ");
            num = sc.nextInt();
            if (num >= 0) {
                total += num;
                System.out.println("점수의 총합은: [" + total + "]");
            } else {
                System.out.print("입력된 점수가 없습니다.");
                break;
            }
        }
    }
}
