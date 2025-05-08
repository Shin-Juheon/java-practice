import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Score = 0;


        System.out.print("점수를 입력해주세요: ");
        Score = sc.nextInt();

        if (Score <= 100 && Score >= 0) {
            switch (Score / 10) {
                case 9, 10:
                    System.out.print("A");
                    break;

                case 8:
                    System.out.print("B");
                    break;

                case 7:
                    System.out.print("C");
                    break;

                case 6:
                    System.out.print("D");
                    break;

                default:
                    System.out.print("F");
                    return;
            }
        } else {
            System.out.print("잘못된 점수를 입력하셨습니다");
            return;
        }
    }
}

