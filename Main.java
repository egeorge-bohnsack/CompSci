import java.util.Random;
import java.util.Scanner;

public class Main {
    
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask for list size
        System.out.print("How large a list do you want? ");
        int size = input.nextInt();
        int[] list = new int[size];

        // Read elements into the array
        for (int i = 0; i < size; i++) {
            System.out.print("Enter in element " + i + ": ");
            list[i] = input.nextInt();
        }

        // Find the minimum element
        int min = list[0];
        for (int i = 1; i < size; i++) {
            if (list[i] < min) {
                min = list[i];
            }
        }

        // Output result
        System.out.println("The minimum element in this list is " + min + ".");
       

        //Create a list of random numbers and find the minimum
        System.out.println("Enter the size of your random list: ");
        int[] randomList = new int[input.nextInt()];
        Random r = new Random();

        for (int i = 0; i < randomList.length; i++) {
            int randomNumber = r.nextInt();
            System.out.println("Putting " + randomNumber + " in position " + i);
            randomList[i] = r.nextInt();
  // Maybe you need to print out this element now to check its value?
        }
               // Fin the minimum element
        int small = randomList[0];
        for (int i = 1; i < small; i++) {
            if (randomList[i] < small) {
                small = randomList[i];
            }
        } 
        System.out.println("The minimum element in this list is " + small + ".");
        input.close(); 
    }
    
}
