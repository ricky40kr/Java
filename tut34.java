import java.util.Arrays;
import java.util.Scanner;

public class tut34 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine();
        sc.close();

        if (isAnagram(a, b)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }

    static boolean isAnagram(String a, String b) {
        char str1[] = (a).toCharArray();
        char str2[] = (b).toCharArray();

        Arrays.sort(str1);
        Arrays.sort(str2);

        if (str1.length != str2.length) {
            return false;
        } else {
            for (int i = 0; i < str1.length; i++) {
                if (str1[i] != str2[i]) {
                    return false;
                }
            }
            return true;
        }
    }
}