import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String product;
        int price = 0;

        System.out.println("물건을 입력하시오: ");
        product = sc.nextLine();

        System.out.println("가격을 입력하시오: ");
        price = sc.nextInt();

        System.out.println(product + "는" + price + "원입니다.");

        sc.close();
    }
}