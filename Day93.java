import java.util.Scanner;
public class BelajarMethod {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("=== Membulatkan Angka ===");
        System.out.print("Input angka desimal : ");
        double angka = sc.nextDouble();
        
        pembulatanAngka(angka);
        
    }
    
    public static void pembulatanAngka(double angkaMethod) {
        System.out.println("\nHasil Pembulatan Angka:");
        System.out.println("1. Dibukatkan ke atas  : " + Math.ceil(angkaMethod));
        System.out.println("2. Dibulatkan ke bawah : " + Math.floor(angkaMethod));
        System.out.println("3. Pembulatan normal   : " + Math.round(angkaMethod));
    }
    
}
