import java.util.Scanner;

public class TraversingLinearArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int size = sc.nextInt();
        int array[] = new int[size];

        for (int i=0;i<size;i++) {
            System.out.print("enter the element at index " + (i+1) + ": ");
            array[i] = sc.nextInt();
        }
        System.out.println("Printing all the elements of Array: ");
        for (int i=0;i<size;i++) {
            System.out.print(array[i] + " ");
            
        }

        System.out.println();

        int k = 0;
        System.out.println("Traversing the Array: ");
        while (k<size) {
            System.out.print(array[k] + " ");
            k+=1;

        }
    }
    
}
