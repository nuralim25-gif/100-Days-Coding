import java.util.Scanner;
public class Day91 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("=== PENJUMLAHAN ===");
        System.out.print("Angka 1 : ");
        int a1 = sc.nextInt();
        System.out.print("Angka 2 : ");
        int a2 = sc.nextInt();
        
        System.out.println("\nHasil dari " + a1 + " + " + a2 + " adalah " + Penjumlahan(a1, a2));
    }
    
    public static int Penjumlahan (int angka1, int angka2) {
        return angka1 + angka2;
    }
    
}
