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
        if (jawaban.equalsIgnoreCase("Ya")) {  //equalsIgnoreCase: bisa menginput huruf besar maupun kecil
            mahasiswa = true;
        }
        else {
            mahasiswa = false;
        }
        
        System.out.println(""); //Baris kosong
        
        //Menampilkan hasil input
        if (mahasiswa) {
            System.out.println("Halo, " + nama + ", Anda berumur " + umur + ", tinggi badan Anda " + tinggi + ", dan Anda seorang mahasiswa.");
        }
        else {
            System.out.println("Halo, " + nama + ", Anda berumur " + umur + ", tinggi badan Anda " + tinggi + ", dan Anda bukan seorang mahasiswa.");
        }
        
        input.close();
        
    }
    
}
