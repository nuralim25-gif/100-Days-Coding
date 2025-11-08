import java.util.Scanner;
public class Day62 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Input nilai N: ");
        int n = input.nextInt();
        int jumlah = 0;
        System.out.printf("%nHasil dari penjumlahan 1-N(%d):%n", n);
        for (int i = 1; i<=n; i++) {
            if (i<n) {
                System.out.print(i + " + ");
            } else {
                System.out.print(i);
            }
            jumlah += i;
        }
        System.out.printf(" = %d", jumlah);
    }
    
}
