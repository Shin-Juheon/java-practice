import java.util.ArrayList;

public class manager {
    private final ArrayList<app> notes = new ArrayList<>();

    public void add(String content) {
        notes.add(new app(content));
    }

    public void remove(int idx) {
        if (isValid(idx)) notes.remove(idx);
    }

    public void edit(int idx, String content) {
        if (isValid(idx)) notes.get(idx).setContent(content);
    }

    public void printAll() {
        if (notes.isEmpty()) {
            System.out.println("비어있음");
            return;
        }
        for (int i = 0; i < notes.size(); i++) {
            System.out.println((i + 1) + ". " + notes.get(i).getContent());
        }
    }

    public void search(String keyword) {
        boolean found = false;
        for (int i = 0; i < notes.size(); i++) {
            if (notes.get(i).getContent().contains(keyword)) {
                System.out.println((i + 1) + ". " + notes.get(i).getContent());
                found = true;
            }
        }
        if (!found) System.out.println("검색 결과 없음");
    }

    public int size() {
        return notes.size();
    }

    private boolean isValid(int idx) {
        return idx >= 0 && idx < notes.size();
    }
}