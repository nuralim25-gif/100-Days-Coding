import java.util.Scanner;
public class day11 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);    
        
        //Input String (nama)
        System.out.print("Masukkan nama Anda: ");
        String nama = input.nextLine();
        
        //Input integer (umur)
        System.out.print("Masukkan umur Anda: ");      
        int umur = input.nextInt();
        
        //Input double (tinggi badan)
        System.out.print("Masukkan tinggi badan Anda: ");
        double tinggi = input.nextDouble();
        input.nextLine(); //Membarsihkan enter yang tersisa
        
        //Input boolean Ya/Tidak (status mahasiswa)
        System.out.print("Apakah Anda seorang mahasiswa? ");
        String jawaban = input.nextLine();
        
        boolean mahasiswa;
        if (jawaban.equalsIgnoreCase("Ya")) {
            mahasiswa = true;
        }
        else {
            mahasiswa = false;
        }
        
        //Menampilkan hasil input
        System.out.println("\n=== Data Anda ===");
        System.out.println("Nama       : " + nama);
        System.out.println("Umur       : " + umur + " tahun");
        System.out.println("Tinggi     : " + tinggi + " cm");
        System.out.println("Mahasiswa? : " + (mahasiswa ? "Ya" : "Tidak"));

        input.close();
        
    }
    
}
