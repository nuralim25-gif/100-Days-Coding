import java.util.Scanner;
public class Day93 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("=== Membulatkan Angka ===");
        System.out.print("Input angka desimal : ");
        double angka = sc.nextDouble();
        
        System.out.println("\nHasil Pembulatan:");
        System.out.println("1. Dibulatkan ke atas  : " + Math.ceil(angka));
        System.out.println("2. Dibulatkan ke bawah : " + Math.floor(angka));
        System.out.println("3. Pembulatan normal   : " + Math.round(angka));
    }
    
}
