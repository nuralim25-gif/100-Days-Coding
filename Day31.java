import java.util.Scanner;
public class Day31 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        //Patokan
        int ketidakhadiran = 3;
        int nilaiminimal = 70;
        
        //Inputan
        System.out.print("Kehadiran: ");
        int alpa = in.nextInt();
        System.out.print("Nilai    : ");
        int nilai = in.nextInt();
        
        //Operasi logika &&
        boolean hasil = (alpa<=ketidakhadiran) && (nilai>=nilaiminimal);
        
        //Menampilkan hasil
        System.out.printf("%nKelulusan: %b", hasil);
    }
    
}
