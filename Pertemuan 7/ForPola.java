import java.util.Scanner;

public class ForPola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukan nilai n: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++ ) {
            for (int j = 1; j <= i; j ++) {
                if (i % 2 == 0) {
                    System.out.print("*");
                } else {
                    if (j % 2 == 0) {
                        System.out.print("-");
                    } else {
                        System.out.print("#");
                    }
                }
            }
            System.out.println();
        }

        
    }
}