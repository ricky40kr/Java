// 1-D Array

import java.util.Scanner;

public class tut28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students : ");
        int n = sc.nextInt();

        int marks[] = new int[n];
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter marks of student " + (i + 1) + " : ");
            marks[i] = sc.nextInt();
        }
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Marks of student " + (i + 1) + " is " + marks[i]);
        }
        sc.close();
    }
}
