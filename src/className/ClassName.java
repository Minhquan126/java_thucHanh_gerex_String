package className;

import java.util.Scanner;

public class ClassName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten lop");
        String className = scanner.nextLine();
        System.out.println(checkClassName(className));
    }
    public static boolean checkClassName(String className){
        String regex = "^[ACP]\\d{4}[GHIKM]$";
        return className.matches(regex);
    }
}
