// Regex (Regular Expression)

import java.util.regex.*;

public class tut59 {
    public static void main(String[] args) {
        // Pattern and Matcher class
        Pattern pattern = Pattern.compile(".xx.");
        Matcher matcher = pattern.matcher("AxxB");
        System.out.println("String matches the given regex : " + matcher.matches());

        Matcher matcher2 = pattern.matcher("AxdxB");
        System.out.println("String matches the given regex : " + matcher2.matches());

        Pattern pattern3 = Pattern.compile(".xx.");
        Matcher matcher3 = pattern3.matcher("AxdxB");
        System.out.println("String matches the given regex : " + matcher3.matches());

        // Character class

        // Simple
        System.out.println(Pattern.matches("[xyz]", "wcdb"));
        System.out.println(Pattern.matches("[xyz]", "x"));
        System.out.println(Pattern.matches("[xyz]", "xam"));
        System.out.println(Pattern.matches("[xyz]", "xxyyyz"));
        // except
        System.out.println(Pattern.matches("[^xyz]", "x"));
    }
}
