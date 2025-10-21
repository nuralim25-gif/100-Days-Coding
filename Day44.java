import java.util.Scanner;
public class Day44 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        //Predikat Nilai
        char predikat;
        
        //Inputan
        System.out.print("Nama         : ");
        String nama = input.nextLine();
        System.out.print("Program Studi: ");
        String prodi = input.nextLine();
        System.out.print("Total Nilai  : ");
        double nilai = input.nextDouble();
        
        //Penentuan Predikat
        if (nilai<=60) {
            predikat = 'E';
        }else if (nilai>=61 && nilai<=70) {
            predikat = 'D';
        }else if (nilai>=71 && nilai<=80) {
            predikat = 'C';
        }else if (nilai>=81 && nilai<=90) {
            predikat = 'B';
        }else {
            predikat = 'A';
        }
        
        //Menampilkan Hasil
        System.out.println("\n=== Rincian ===");
        System.out.println("Nama           : " + nama);
        System.out.println("Program Studi  : " + prodi);
        System.out.println("Predikat Nilai : " + predikat);
    }
    
}
