import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
   /*/     System.out.println("Hi, dumbass");

        String line;
        Scanner in = new Scanner(System.in);

        System.out.print("Type something: ");
        line = in.next();
        System.out.println("You said: " + line); */

        Scanner input = new Scanner(System.in);
        System.out.print("How large of a list do you want?");
        int size = input.nextInt();
        
        int[] list = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter in element " + i + ": ");
            list[i] = input.nextInt();
        }  
            System.out.println(list);
    }
    
}
