import java.util.Scanner;
public class Day63 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Input nilai N: ");
        int n = input.nextInt();
        int hasil = 1;
        System.out.printf("%nHasil dari perkalian 1-N(%d):%n", n);
        for (int i = 1; i<=n; i++) {
            if (i<n) {
                System.out.print(i + " X ");
            } else {
                System.out.print(i);
            }
            hasil *= i;
        }
        System.out.printf(" = %d", hasil);
    }
    
}
