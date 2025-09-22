package oprasi;
import java.util.Scanner;
public class day15 {
    
    public static void main(String[] args) {
        Scanner masukan = new Scanner (System.in);     
        
        
        //Inputan
        System.out.print("Masukkan angka pertama: ");
        int angka1 = masukan.nextInt();
        
        System.out.print("Masukkan angka kedua  : ");
        int angka2 = masukan.nextInt();
        
        
        //Operasi aritmatika (+ & -)
        int hasiljumlah = angka1 + angka2;
        int hasilkurang = angka1 - angka2;
        
        
        //Hasil operasi
        System.out.print("\nHasil Penjumlahan: " + hasiljumlah);
        System.out.print("\nHasil Pengurangan: " + hasilkurang);         
        
    }
    
}
