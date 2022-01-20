// Binary Search Without CLass

import java.util.Scanner;

public class tut48 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("\t\tLinear Search Program");
        System.out.println("\t\t*********************");

        int flag=0, mug=0, item, n;

        // Creating Array
        System.out.print("Enter the length of array you want : ");
        n=sc.nextInt();
        System.out.println();
        int arr[]=new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the value of "+(i+1)+" position : ");
            arr[i]=sc.nextInt();
        }

        // Taking input to search
        System.out.print("Enter the number you want to search : ");
        item=sc.nextInt();

        // Binary Search
        int LOW=0;
        int HIGH=n;
        while(LOW<=HIGH){
            int MID=(LOW+HIGH)/2;

            if (arr[MID]==item)
            {
                mug=MID+1;
                flag=0;
                break;
            }
            else if(arr[MID]>item)
            {
                HIGH=MID-1;
            }
            else{
                LOW=MID+1;
            }

            flag=-1;

    }
        if (flag==-1)
    {
        System.out.println("Search Unsuccessfull!");
        System.out.println(item+" is not in the array.");
    }
    else
    {
        System.out.println("Search Successfull!");
        System.out.println(item+" is at "+mug+" position in the array.");
        
    }
    sc.close();
    }
}
