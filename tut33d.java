// Replacing a charater without using replace() method 

public class tut33d {
    public static void main(String[] args) {
        String s1 = "The quick brown fox jumps over the lazy dog";
        String result = "";

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == 'e') {
                result += 'z';
            } else {
                result += s1.charAt(i);
            }
        }

        System.out.println("Before : " + s1);
        System.out.println("After : " + result);
    }
}
