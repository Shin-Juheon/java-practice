import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    // 메모 저장 리스트
    static ArrayList<String> memo = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("--- 할 일 관리 ---");
            System.out.println("1. 할 일 추가");
            System.out.println("2. 할 일 삭제");
            System.out.println("3. 할 일 보기");
            System.out.println("4. 종료");
            System.out.println("메뉴 선택: ");

            choice = sc.nextInt();
            sc.nextLine();

            // 작업 수행
            switch (choice) {
                case 1:
                    System.out.print("추가할 할 일 입력: ");





                case 6:
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("잘못된 선택입니다. 다시 시도해주세요.");
            }
        } while (choice != 6);