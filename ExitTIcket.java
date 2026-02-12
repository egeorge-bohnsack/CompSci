public class ExitTIcket{ 

/*    public static void changeNumber(int x) {
         x++;
         System.out.println(x);
    }
    public static void main(String[] args) {
        int x = 3;
        changeNumber(x);
        System.out.println(x);
    } */
   /* public static void changeNumber(int[] x) {
        x[0]++;
    }
    public static void main(String[] args) {
        int[] x = new int[1];
        x[0] = 10; 
        changeNumber(x);
        System.out.println(x[0]);
    } */
   public static void changeNumber(int[] x) {
    x = new int[1];
    x[0] = 1;
}
public static void main(String[] args) {
    int[] x = new int[1];
    x[0] = 11;
    changeNumber(x);
    System.out.println(x[0]);
}
}