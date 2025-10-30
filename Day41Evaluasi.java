//Soal 1
package mente;
import java.util.Scanner;
public class Soal1 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        //Inputan
        System.out.print("Masukkan nama: ");
        String nama = in.nextLine();
        System.out.print("Masukkan angka dalam bentuk String: ");
        String nilaiA = in.nextLine();
        
        int a = Integer.parseInt(nilaiA);
        a++;
        a--;
        
        a+=6;
        a-=3;
        
        String b = String.valueOf(a);
        
        System.out.println("Nama: " + nama);
        System.out.println("Nilai akhir (Int): " + a);
        System.out.println("Nilai akhir (String): " + b);
    }
}

//Soal 2
package mente;
import java.util.Scanner;
public class Soal2 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        System.out.println("=== Pilih Bangun Datar ===");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Lingkaran");
       
        System.out.print("Masukkan pilihan: ");
        int pilihan = in.nextInt();
        
        double hasil = 0;
        if (pilihan == 1) {
            System.out.print("Masukkan sisi: ");
            double s = in.nextDouble();
            
            hasil+= (s*s);
        } else if (pilihan==2) {
            System.out.print("Masukkan Panjang: ");
            double p = in.nextDouble();
            System.out.print("Masukkan Lebar  : ");
            double l = in.nextDouble();
            
            hasil+= (p*l);
        } else if (pilihan==3) {
            System.out.print("Masukkan jari-jari: ");
            double r = in.nextDouble();
            
            hasil+= (3.14*r*r);
        }
        
        System.out.printf("Luas Bangunan: %.1f", hasil);
    }
    
}

//Soal 3
package mente;
import java.util.Scanner;
public class NewClass {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        System.out.print("Masukkan nama siswa: ");
        String nama = in.nextLine();
        System.out.print("Masukkan nilai siswa: ");
        int nilai = in.nextInt();
        
        String g1 = "Nilai Ganjil";
        String g2 = "Nilai Genap";
        
        String f;
        if (nilai%2==1){
            f=g1;
            if(nilai<60){
                System.out.println("\nSiswa: " + nama + " Tidak Lulus");
                System.out.println(f);
            } else if (nilai>=60&&nilai<75) {
                System.out.println("\nSiswa: " + nama + " Cukup");
                System.out.println();
            } else if (nilai>=75&&nilai<90){
                System.out.println("\nSiswa: " + nama + " Baik");
                System.out.println(f);
            } else if (nilai>=90){
                System.out.println("\nSiswa: " + nama + " Sangat Baik");
                System.out.println(f);
            }
        }else {
           f = g2;
           if(nilai<60){
                System.out.println("\nSiswa: " + nama + " Tidak Lulus");
                System.out.println(f);
            } else if (nilai>=60&&nilai<75) {
                System.out.println("\nSiswa: " + nama + " Cukup");
                System.out.println(f);
            } else if (nilai>=75&&nilai<90){
                System.out.println("\nSiswa: " + nama + " Baik");
                System.out.println(f);
            } else if (nilai>=90){
                System.out.println("Siswa: " + nama + " Sangat Baik");
                System.out.println(f);
            }
        }
    }
}

//Soal 4
package mente;
import java.util.Scanner;
public class Soal441 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        //Diskon
        String pDiskon = "";
        double diskon1 = 20/100.0;
        double diskon2 = 10/100.0;
        double potongan = 0;
        double total = 0;
        
        //Inputan
        System.out.print("Masukkan nama kasir  : ");
        String nama = in.nextLine();
        System.out.print("Masukkan harga barang (Rp): ");
        double harga = in.nextDouble();
        
        if (harga>1000000){
            pDiskon = "20%";
            potongan = harga*diskon1;
            total = harga-potongan;
            
        } else if (harga>=500000 && harga <=1000000){
            pDiskon = "10%";
            potongan = harga*diskon2;
            total = harga-potongan;
        } else if (harga<500000) {
            pDiskon = "0%";
            potongan = 0;
            total = harga;
        }
        
        System.out.println("\n=== Struk Pembayaran ===");
        System.out.printf("Nama Kasir\t: %s", nama);
        System.out.printf("%nHarga Barang\t: Rp %.1f", harga);
        System.out.printf("%nDiskon %s\t: Rp %.1f", pDiskon, potongan);
        System.out.printf("%nTotal Bayar\t: Rp %.1f", total);
    }
}
