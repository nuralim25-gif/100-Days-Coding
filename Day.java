import java.util.Scanner;
public class Day77 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        //Inputan
        System.out.print("Teks (minimal 8 karakter termasuk spasi) : ");
        String teks = input.nextLine();
        
        //Method manipulasi
        String Tsubstring = teks.substring(3, 7);
        String Treplace = teks.replace('a', 'i');
        String Ttrim = teks.trim();
        
        //Hasil
        System.out.println("\n=== Rincian ===");
        System.out.println("Versi asli                               : " + teks);
        System.out.println("1. Ambil karakter 3-7                    : " + Tsubstring);
        System.out.println("2. Ganti huruf a (kecil) jadi i (kecil)  : " + Treplace);
        System.out.println("3. Hapus spasi sebelum & sesudah kalimat : " + Ttrim);
    }
    
}
