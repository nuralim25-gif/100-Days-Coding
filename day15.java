package oprasi;
import java.util.Scanner;
public class day15 {
    
    public static void main(String[] args) {
        Scanner masukan = new Scanner (System.in);     
        int angka1, angka2;
        char operasi;
        String pilihan;
        
        do {
            //Input angka pertama
            while (true) {
            System.out.print("Masukkan angka pertama: ");
                if (masukan.hasNextInt()) {
                    angka1 = masukan.nextInt();
                    break; //Keluar loop kalau input valid
                } else {
                   System.out.println("Input harus berupa angka! Silahkan coba lagi.");
                    masukan.next();
                }
            }
            
            //Input angka kedua
            while (true) {
            System.out.print("Masukkan angka kedua  : ");
                if (masukan.hasNextInt()) {
                    angka2 = masukan.nextInt();
                    break;
                } else {
                   System.out.println("Input harus berupa angka! Silahkan coba lagi.");
                    masukan.next();
                }
            }
            
            //Validasi dan Proses Operasi
            while (true) {
                System.out.print("Masukkan operasi (+/-): ");
                operasi = masukan.next().charAt(0);
            if (operasi == '+' || operasi == '-'){
                break;
            } else {
                System.out.println("Operasi tidak valid! Silahkan coba lagi.");
            }
            }
            
            // Proses Operasi
            if (operasi == '+'){
                System.out.print("Hasil: " + (angka1 + angka2));
            } else {
                System.out.print("Hasil: " + (angka1 - angka2));
            }
            
            //Tanya apakah mau ulang
            System.out.print("\nApakah Anda ingin mencoba lagi? ");
            pilihan  = masukan.next();
            System.out.println();
        } while (pilihan.equalsIgnoreCase("Ya") || pilihan.equalsIgnoreCase("ya"));
        
        System.out.print("Terima Kasih");
        
        masukan.close(); //Program diakhiri
    }
    
}
