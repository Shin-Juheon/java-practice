import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int student, sub;


        System.out.print("학생 수를 입력하세요: ");
        student = sc.nextInt();
        System.out.print("과목수를 입력하세요: ");
        sub = sc.nextInt();

        int[][] score = new int[student][sub];
        for (int i = 0; i < student; i++) {
            System.out.println("\n[" + (i + 1) + "번 학생의 성적 입력]");
            for (int j = 0; j < sub; j++) {
                System.out.print("과목 " + (j + 1) + " 점수: ");
                score[i][j] = sc.nextInt();
            }
        }
        System.out.println("---성적표---");
        for (int i = 0; i < student; i++) {
            System.out.println((i + 1) + "번 학생: ");
            for (int j = 0; j < sub; j++) {
                System.out.print(score[i][j] + " ");
            }
            System.out.println();
        }

    }
}