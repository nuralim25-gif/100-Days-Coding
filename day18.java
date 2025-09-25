import java.util.Scanner;
public class day18 {
    public static void main(String[] args) {
        Scanner inputan = new Scanner (System.in);
        
        System.out.print("Masukkan sebuah angka: ");
        byte angkabyte = inputan.nextByte();
        
        System.out.print("Ingin ubah tipe data? (Y/N)");
        char jawaban1 = inputan.next().charAt(0);
        if (jawaban1 == 'Y'|| jawaban1 == 'y') {
            System.out.println("Pilih tipe data tujuan: ");    
            System.out.println("1. Short");
            System.out.println("2. Integer");
            System.out.println("3. Long");
            System.out.print("Masukkan pilihan Anda: ");
            int pilihan = inputan.nextInt();
            
            switch (pilihan){
                case 1:
                short angkashort = angkabyte;
                System.out.println("Hasil Konversi: " + angkashort);     
                break;
                
                case 2:
                short angkaint = angkabyte;
                System.out.println("Hasil Konversi: " + angkaint);
                break;
                
                case 3:
                long angkalong = angkabyte;
                System.out.println("Hasil Konversi: " + angkalong);
                break;
            }
                
            } else {
                System.out.println("Terima kasih");
            
        }
        
    }
    
}
