//Soal nomor 1
package evaluasi;
public class no1 {
    public static void main(String[] args) {
        String nama;
        byte umur;
        double tinggi;
        double berat;
        byte absen;
        short sks;
        String nim;
        char jk;
        boolean mahasiswa;
        
        nama = "Budi";
        umur = 21;
        tinggi = 170.5;
        berat = 65.4;
        absen = 12;
        sks = 144;
        nim = "D0223033";
        jk = 'L';
        mahasiswa = true;
        
        //Output Println
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Tinggi Badan: " + tinggi);
        System.out.println("Berat Badan: " + berat);
        System.out.println("No. Absen: " + absen);
        System.out.println("Jumlah SKS: " + sks);
        System.out.println("NIM: " + nim);
        System.out.println("Jenis Kelamin: " + jk);
        System.out.println("Status Aktif Kuliah: " + mahasiswa);
        
        //Output Print
        System.out.print("\nNama: " + nama + "\tUmur: " + umur + "\t Tinggi Badan: " + tinggi + "\tBerat Badan: " + berat + "\tNo. Absen: " + absen + "\tJumlah SKS: " + sks + "\tNIM: " + nim + "\tJenis Kelamin: " + jk + "\tStatus Aktif Kuliah: " + mahasiswa);                               
        
        System.out.println(""); //Baris kosong
        
        //Output Printf
        System.out.printf("\n         ~~~BIODATA~~~");
        System.out.printf("\nNama                  : %s", nama);
        System.out.printf("\nUmur                  : %d", umur);
        System.out.printf("\nTinggi Badan          : %f", tinggi);
        System.out.printf("\nBerat Badan           : %f", berat);
        System.out.printf("\nNo. Absen             : %d", absen);
        System.out.printf("\nJumlah SKS            : %d", sks);
        System.out.printf("\nNomor Induk Mahasiswa : %s", nim);
        System.out.printf("\nJenis Kelamin         : %c", jk);
        System.out.printf("\nStatus Aktif Kuliah   : %b", mahasiswa);
    }  
}


//Soal nomor 2
package evaluasi;
public class no2 {
    public static void main(String[] args) {
        //Deklarasi
        String nama;
        double tinggi;
        double berat;
        byte absen;
        short sks;
        String nim;
        char jk;
        boolean mahasiswa;
        
        //Inisialisasi
        nama = "Budi";
        tinggi = 170.5;
        berat = 65.4;
        absen = 12;
        sks = 144;
        nim = "D0223033";
        jk = 'L';
        mahasiswa = true
        
        System.out.println("Nama: " + nama);
        System.out.println("Tinggi Badan: " + tinggi);
        System.out.println("Berat Badan: " +berat);
        System.out.println("No. Absen" + absen);
        System.out.println("Jumlah SKS: " + sks);
        System.out.println("NIM: " + nim);
        System.out.println("Jenis Kelamin: " + jk);
        
        //Update
        nama = "Budiman";
        tinggi = 180.5;
        berat = 65.7;
        absen = 10;
        sks = 150;
        nim = "D0223050";
        jk = 'L';
        
        System.out.println("Nama: " + nama);
        System.out.println("Tinggi Badan: " + tinggi);
        System.out.println("Berat Badan: " + berat);
        System.out.println("No. Absen" + absen);
        System.out.println("Jumlah SKS: " + sks);
        System.out.println("NIM: "+nim);
        System.out.println("Jenis Kelamin: " + jk);

    }   
}


//Soal nomor 3
package evaluasi;
import java.util.Scanner;
public class no3 {
    public static void main(String[] args) {
      
        Scanner input = new Scanner (System.in);
        System.out.print("Nama: ");
        String nama = input.nextLine();
        
        System.out.print("Umur: ");
        int umur = input.nextInt();
        
        System.out.print("Tinggi Badan: ");
        double tinggi = input.nextDouble();
        
        System.out.print("No. Absen: ");
        byte absen = input.nextByte();
        
        System.out.println("\nHalo, " + nama + ", Anda berumur " + umur + " tahun" + ", tinggi badan Anda adalah "+tinggi+" meter, "+" dan nomor absen Anda adalah "+absen);
        
    }
}
