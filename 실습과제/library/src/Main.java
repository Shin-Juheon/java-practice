import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("좌석 행 수를 입력하세요: ");
        int row  = sc.nextInt();
        System.out.print("좌석 열 수를 입력하세요: ");
        int column = sc.nextInt();

        int [][] seats = new int[row][column];

        while(true) {
            System.out.println("== 좌석을 번호를 입력하세요(0,0 입력시 종료 ==\n");
            System.out.print("예약하고 싶은 행을 입력하세요: ");
            int r = sc.nextInt();
            System.out.print("예약하고 싶은 열을 입력하세요: ");
            int c = sc.nextInt();

            // 프로그램 종료
            if (r == 0 && c == 0) {
                break;
            }

            // 유효성 검사
            if (r < 1 || r > row || c < 1 || c > column) {
                System.out.println("다시 입력해주세요.");
                continue;
            }


            // 인덱스
            int Rindex = r - 1;
            int Cindex = c - 1;

            //좌석 유무
            if (seats[Rindex][Cindex] == 1) {
                System.out.println("이미 예약된 좌석입니다");
            } else {
                seats[Rindex][Cindex] = 1;
                System.out.println("좌석 예약이 완료되었습니다.");
            }
        }

        System.out.println("== 좌석 배치도(0: 비어있음, 1: 예약됨) ==");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
    }
}