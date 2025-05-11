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
                    // 할 일 추가
                    System.out.print("추가할 할 일 입력: ");
                    String task = sc.nextLine();
                    addTask(task);
                    break;
                case 2:
                    // 할 일 삭제
                    deleteTask(scanner);
                    break;
                case 3:
                    // 저장된 할 일 보기
                    viewTasks();
                    break;
                case 4:
                    // 프로그램 종료
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    // 잘못된 입력 처리
                    System.out.println("잘못된 선택입니다. 다시 시도해주세요.");
            }
        } while (choice != 4); // 4번(종료)을 선택할 때까지 반복

        sc.close(); // Scanner 해제
    }

    // 할 일 추가
    private static void addTask(String task) {
        todoList.add(task); // 리스트 끝에 새로운 할 일 추가
        System.out.println("할 일이 추가되었습니다:  " + task);
    }
}