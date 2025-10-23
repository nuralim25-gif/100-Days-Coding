import java.util.Scanner;
public class Day46 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("%%% Pilihan Menu %%%");
        System.out.println("1. Menghitung Luas Persegi");
        System.out.println("2. Menghitung Luas Segitiga");
        System.out.println("3. Menghitung Luas Lingkaran");
        System.out.print("\nMenu yang dipilih (1/2/3): ");
        int pilihan = input.nextInt();
        
        switch (pilihan) {
            case 1:
            System.out.println("\n=== Mengitung Luas Persegi ===");
            System.out.print("Input sisi  : ");
            double sisi = input.nextDouble();
            System.out.printf("Luas Persegi: %.2f cm²", (sisi*sisi));
            break;
            
            case 2:
            System.out.println("\n=== Mengitung Luas Persegi ===");
            System.out.print("Input alas   : ");
            double alas = input.nextDouble();
            System.out.print("Input tinggi : ");
            double tinggi = input.nextDouble();
            System.out.printf("Luas Segitiga: %.2f cm²", (0.5 * alas * tinggi));
            break;
            
            case 3:
            System.out.println("\n=== Mengitung Luas Persegi ===");
            System.out.print("Input jari-jari: ");
            double jarijari = input.nextDouble();
            System.out.printf("Luas Lingkaran : %.2f cm²", (Math.PI * jarijari * jarijari));
            break;
            
            default:
            System.out.println("\nPilihan tidak valid!!!");
        }
    }
    
}
