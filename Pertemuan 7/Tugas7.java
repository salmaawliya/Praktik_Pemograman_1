import java.util.Scanner;

public class Tugas7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan nilai n = ");
        int n = scan.nextInt();
        if (n % 2 == 0) {
            for (int i = 1; i <= (n + 1) ; i++) {
               if (i <= n/2) {
                    for (int j = 1; j <= i-1; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= ((n+3)- (i*2)); j++) {
                        if (j == ((n+4)- (i*2)) / 2) {
                           System.out.print("-");
                        } else {
                           System.out.print("*");
                        }
                    }
                    System.out.println("");
                } else {
                    for (int j = 1; j <= (n+1)-i; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= ((2 * i) - (n+1)); j++) {
                        if (j == i-(n-(n/2))) {
                           System.out.print("-");
                        } else {
                           System.out.print("*");
                        }
                    }
                    System.out.println("");
                }
            }
        } else {
            for (int i = 1; i <= n ; i++) {
                if (i <= n/2) {
                    for (int j = 1; j <= i-1; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= ((n+2)- (i*2)); j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                } else {
                    for (int j = 1; j <= n-i; j++) {
                    System.out.print(" ");
                    }
                    for (int j = 1; j <= (2 * i - n); j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
            }
        }

    }
}