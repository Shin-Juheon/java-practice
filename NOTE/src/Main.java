import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        manager noteBox = new manager();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1.추가 2.삭제 3.수정 4.검색 5.전체보기 0.종료");
            int menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.print("메모 입력: ");
                    noteBox.add(sc.nextLine());
                    break;
                case 2:
                    noteBox.printAll();
                    if (noteBox.size() > 0) {
                        System.out.print("삭제할 번호: ");
                        noteBox.remove(sc.nextInt() - 1);
                        sc.nextLine();
                    }
                    break;
                case 3:
                    noteBox.printAll();
                    if (noteBox.size() > 0) {
                        System.out.print("수정할 번호: ");
                        int idx = sc.nextInt() - 1;
                        sc.nextLine();
                        System.out.print("새 내용: ");
                        noteBox.edit(idx, sc.nextLine());
                    }
                    break;
                case 4:
                    System.out.print("검색어: ");
                    noteBox.search(sc.nextLine());
                    break;
                case 5:
                    noteBox.printAll();
                    break;
                case 0:
                    System.out.println("종료");
                    return;
                default:
                    System.out.println("잘못된 입력");
            }
        }
    }
}