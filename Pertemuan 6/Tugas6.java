import java.util.Scanner;

public class Tugas6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukan bilangan maksimal yang akan ditampilkan: ");
        int n = scanner.nextInt();
        int i = 0;
        int count = 0;
        while (i != n) {
            if(i == Math.pow(5,count)) {
                System.out.println(i);
                count++;
            }
            i++;
            
        }
        
    }
}