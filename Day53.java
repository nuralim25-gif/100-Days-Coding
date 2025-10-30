import java.util.Scanner;
public class Day53 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("=== Menghitung Luas Bangun Datar ===");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Lingkaran");
        
        //Inputan
        System.out.print("\nInput pilihan: ");
        int pilihan = input.nextInt();
        
        //Inisialisasi variabel luas
        double luas = 0;
        
        //Percabangan switch-case
        switch (pilihan) {
            case 1:
            System.out.print("Input sisi: ");
            double sisi = input.nextDouble();
            luas = sisi*sisi;
            break; //Keyword break
            
            case 2:
            System.out.print("Input panjang: ");
            double panjang = input.nextDouble();
            System.out.print("Input lebar  : ");
            double lebar = input.nextDouble();
            luas = panjang*lebar;
            break; //Keyword break
            
            case 3:
            System.out.print("Input jari-jari: ");
            double r = input.nextDouble();
            luas = Math.PI*r*r;
            break; //Keyword break
        }
        
        //Menampilkan hasil perhitungan luas
        System.out.printf("%nLuas: %.2f", luas);
        
    }
    
}
