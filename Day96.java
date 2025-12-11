import java.util.Scanner;
public class Day96 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int angka1, angka2;
        
        System.out.print("Input angka 1: ");
        angka1 = sc.nextInt();
        System.out.print("Input angka 2: ");
        angka2 = sc.nextInt();
        
        System.out.println("\n=== HASIL OPERASI ===");
        System.out.println("Hasil penjumlahan: " + penjumlahan(angka1, angka2));
        System.out.println("Hasil pengurangan: " + pengurangan(angka1, angka2));
        System.out.println("Hasil perkalian  : " + perkalian(angka1, angka2));
        System.out.println("Hasil pembagian  : " + pembagian(angka1, angka2));
    }
    
    public static int penjumlahan (int a1, int a2) {
        return a1 + a2;
    }
     
    public static int pengurangan (int a1, int a2) {
        return a1 - a2;
    }
    
    public static int perkalian (int a1, int a2) {
        return a1 * a2;
    }
    
    public static int pembagian (int a1, int a2) {
        return a1 / a2;
    }
    
}
