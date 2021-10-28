import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] bilangan = new int[5];
        for (int i = 0; i<5; i++) {
            System.out.print("Masukan bilangan ke-"+i+" = ");
            bilangan[i] = scan.nextInt();
        }
        for (int i=0; i<bilangan.length; i++) {
            System.out.println("Bilangan ke-"+i+" = "+bilangan[i]);
        }
    }
    
}
