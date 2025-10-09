import java.util.Scanner;
public class Day32 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        //Patokan
        int nilaiminimal = 70;
        int hadirminimal = 6;
        
        //Inputan
        System.out.print("Input Nilai    : ");
        int nilai = in.nextInt();
        System.out.print("Input Kehadiran: ");
        int hadir = in.nextInt();
        
        //Menerapkan operator logika or
        boolean hasil = (nilai>=nilaiminimal) || (hadir>=hadirminimal);
        
        //Menampilkan hasil
        System.out.println("\nStatus Kelulusan: " + hasil);
    }
    
}
