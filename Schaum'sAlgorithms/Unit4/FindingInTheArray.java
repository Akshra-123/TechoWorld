/* Find the number of years during which more than 300 automobiles were sold */

import java.util.Scanner;

public class FindingInTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int size = sc.nextInt();
        int array[] = new int[size];
        int count =0;
        int i=0;

        for (i=0;i<size;i++) {
            System.out.print("enter the element at index " + (i+1) + ": ");
            array[i] = sc.nextInt();
        }
        System.out.println("Printing all the elements of Array: ");
        for (i=0;i<size;i++) {
            System.out.print(array[i] + " ");
            
        }

        System.out.println();

        for (i=0;i<size;i++) {
            if (array[i]>300) {
                count++;
        }
    }
    System.out.println(count);
        

        
    }
    
}
