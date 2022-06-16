// Exception Handling

public class tut88 {
    public static void main(String[] args) {
        int n1 = 5;
        int n2 = 0;
        int q = 0;

        try {
            q = n1 / n2;
        } catch (Exception e) {
            System.out.println("Error : " + e);
        }

        System.out.println("The quotient is : " + q);
        System.out.println("\t\t****End of Program****");
    }
}