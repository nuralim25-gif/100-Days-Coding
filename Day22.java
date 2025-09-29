import java.util.Scanner;
public class Day22 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        //Meminta panjang sisi persegi yang ingin dihitung luasnya
        System.out.print("Masukkan panjang sisi: ");
        double sisi = input.nextDouble();
        
        //Menghitung luas persegi
        double luas = sisi * sisi;
        
        //Menampilkan hasil
        System.out.println("\nPanjang sisi persegi:" + sisi);
        System.out.println("Luas persegi        :" + luas);
        
    }
    
}
