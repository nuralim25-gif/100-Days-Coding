package DeklarasiInisialisasidanUpdateVariabel;

public class day9 {
    
    public static void main(String[] args) {
        //Deklarasi
        String nama;
        int umur;
        
        //Inisialisasi
        nama = "Nur Alim";
        umur = 16;
        System.out.println("Biodata Awal:");
        System.out.println("Nama\t: " + nama);      
        System.out.println("Umur\t: " + umur);
        
        System.out.println(); //Baris kosong di antara paragraf   
        
        //Update
        nama = "Nur Alim";
        umur = umur + 1;
        System.out.println("Biodata Terbaru:");   
        System.out.println("Nama\t: " + nama);
        System.out.println("Umur\t: " + umur);
    }
    
}
