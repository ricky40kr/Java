// Reversing the string word by word

import java.util.Scanner;

public class tut41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String s = sc.nextLine();
        System.out.println("");
        sc.close();

        int i = s.length() - 1;
        int j = 0;
        String ans = "";

        while (i >= 0) {
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
                j = i;
            }
            if (i < 0)
                break;
            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }
            if (ans.isEmpty()) {
                ans = ans.concat(s.substring(i + 1, j + 1));
            } else {
                ans = ans.concat(" " + s.substring(i + 1, j + 1));
            }
        }
        System.out.println("The word by word reversed string : " + ans);
    }
}
