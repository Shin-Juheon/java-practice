import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean error = true;
        int total, menu, option, size = 0;

        System.out.println("음료를 선택하세요: 1-아메리카노, 2-카페라떼, 3-카푸치노: ")
        menu = sc.nextInt();

        if(menu == 1){
            total