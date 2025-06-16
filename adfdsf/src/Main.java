import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private final ArrayList<String> noteBox = new ArrayList<>();

    // 메모 추가
    public void addNote(Scanner sc) {
        String memo = inputMemo(sc);
        saveMemo(memo);
        printMemo(memo);
    }

    // 입력
    private String inputMemo(Scanner sc)
    {
        System.out.print("추가할 메모 입력: ");
        return sc.nextLine();
    }

    // 저장
    private void saveMemo(String memo)
    {
        noteBox.add(memo);
    }

    // 메세지 출력
    private void printMemo(String memo)
    {
        System.out.println("메모가 추가되었습니다: " + memo + "\n");
    }



    // 전체 목록 보기
    public boolean showAllNotes() {
        printAllNotes();
        return noteBox.isEmpty();
    }

    private void printAllNotes() {
        System.out.println("=== 전체 목록 ===");
        if (noteBox.isEmpty()) {
            System.out.println("비어있습니다.\n");
            return;
        }
        for (int i = 0; i < noteBox.size(); i++) {
            System.out.println((i + 1) + ". " + noteBox.get(i));
        }
        System.out.println();
    }

    // 삭제 메서드
    public void deleteNote(Scanner sc) {
        if (showAllNotes()) return;
        int num = inputDeleteIndex(sc);
        if (isDeleteAll(num)) {
            deleteAllNotes();
            printDeleteAllResult();
            return;
        }
        if (!checkNum(num)) {
            printInvalidIndex();
            return;
        }
        String erased = deleteMemo(num);
        printDeleteResult(num, erased);
        showAllNotes();
        askExit(sc);
    }

    // 삭제 번호 입력
    private int inputDeleteIndex(Scanner sc) {
        System.out.print("삭제할 번호를 입력하세요 (0 입력 시 전체 삭제): ");
        int num = sc.nextInt();
        sc.nextLine();
        return num;
    }

    // 전체 삭제 여부
    private boolean isDeleteAll(int num) {
        return num == 0;
    }

    // 전체 삭제
    private void deleteAllNotes() {
        noteBox.clear();
    }

    // 전체 삭제 안내
    private void printDeleteAllResult() {
        System.out.println("모든 메모가 삭제되었습니다.");
    }


    // 잘못된 번호 안내
    private void printInvalidIndex() {
        System.out.println("존재하지 않는 번호입니다.\n");
    }

    // 개별 삭제
    private String deleteMemo(int num) {
        return noteBox.remove(num - 1);
    }

    // 삭제 안내
    private void printDeleteResult(int num, String erased) {
        System.out.println("삭제된 메모: " + num + "번 => " + erased + "\n");
    }

    // 수정 메서드
    public void editNote(Scanner sc) {
        if (showAllNotes()) return;
        int num = inputEditIndex(sc);
        if (!checkNum(num)) {
            printInvalidIndex();
            return;
        }
        String oldM = getMemo(num);
        printOldMemo(oldM);
        String newM = inputNewMemo(sc);
        setMemo(num, newM);
        printEditResult();
        showAllNotes();
        askExit(sc);
    }

    // 수정 번호 입력
    private int inputEditIndex(Scanner sc) {
        System.out.print("수정할 번호를 입력하세요: ");
        int num = sc.nextInt();
        sc.nextLine();
        return num;
    }

    // 기존 메모 반환
    private String getMemo(int num) {
        return noteBox.get(num - 1);
    }

    // 기존 내용 안내
    private void printOldMemo(String oldM) {
        System.out.println("기존 내용: " + oldM);
    }

    // 새 내용 입력
    private String inputNewMemo(Scanner sc) {
        System.out.print("새 내용을 입력하세요: ");
        return sc.nextLine();
    }

    // 메모 수정
    private void setMemo(int num, String newM) {
        noteBox.set(num - 1, newM);
    }

    // 수정 안내
    private void printEditResult() {
        System.out.println("수정되었습니다.\n");
    }

    // 검색 메서드
    public void findNotes(Scanner sc) {
        if (showAllNotes()) return;
        String keyword = inputSearchKeyword(sc);
        printSearchResult(keyword);
    }

    // 검색어 입력
    private String inputSearchKeyword(Scanner sc) {
        System.out.print("검색할 단어를 입력하세요: ");
        return sc.nextLine();
    }

    // 검색 결과 출력
    private void printSearchResult(String keyword) {
        System.out.println("=== 검색 결과 ===");
        boolean found = false;
        for (int i = 0; i < noteBox.size(); i++) {
            String memo = noteBox.get(i);
            if (memo.contains(keyword)) {
                System.out.println((i + 1) + ". " + memo);
                found = true;
            }
        }
        if (!found) {
            System.out.println("검색 결과가 없습니다.");
        }
        System.out.println();
    }

    // 메뉴로 가기 or 종료하기
    private void askExit(Scanner sc) {
        while (true) {
            System.out.println("1: 메뉴, 2: 종료");
            switch (sc.nextInt()) {
                case 1 -> { return; }
                case 2 -> {
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
                }
                default -> System.out.println("1 또는 2를 입력해주세요.\n");
            }
        }
    }

    // 인덱스 유효성 검사
    private boolean checkNum(int num) {
        return num >= 1 && num <= noteBox.size();
    }
}
