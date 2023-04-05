package phoneNumb;

import java.util.Scanner;

public class PhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so dien thoai");
        String phoneNumbs = scanner.nextLine();
        System.out.println(check(phoneNumbs));
    }
    public static boolean check(String numbs){
        String regex = "^\\(\\d{2}\\)-\\(\\d{9}\\)";
        return numbs.matches(regex);
    }
}
