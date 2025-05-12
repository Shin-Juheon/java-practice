import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    // 할일 저장 리스트
    private static ArrayList<String> todoList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //사용자 입력 받기
        int choice; // 선택값 저장 변수

        do {
            // 메뉴 표시
            System.out.print("\n--- 할 일 관리 ---");
            System.out.println("1. 할 일 추가");
            System.out.println("2. 할 일 삭제");
            System.out.println("3. 할 일 보기");
            System.out.println("4. 종료");
            System.out.println("메뉴 선택: ");

            //사용자 입력받기
            choice = sc.nextInt();
            sc.nextLine();

            // 작업 수행
            switch (choice) {
                case 1:
            