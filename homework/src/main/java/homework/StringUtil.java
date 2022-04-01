package homework;

import java.util.Scanner;

public class StringUtil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder stringBuilder = new StringBuilder(s);
        for (int i = 0; i < stringBuilder.length(); i++) {
            if (stringBuilder.charAt(i) == ' ') {
                stringBuilder.deleteCharAt(i);
                i--;
            }
        }
        System.out.println(stringBuilder.toString());
    }
}
