import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);
    int radius;

    public void setRadius() {
        radius = inputNum();
    }

    public int inputNum() {
        System.out.print("반지름을 입력해주세요: ");
        radius = sc.nextInt();
        return radius;
    }

    public double calculateArea() {
        return 3.14 * radius * radius;
    }

    public void printCircleInfo() {
        System.out.println("반지름: " + radius);
        System.out.println("넓이: " + calculateArea());
    }

    public static void main(String[] args)
    {
        Main main = new Main();
        main.setRadius();
        main.printCircleInfo();
    }
}