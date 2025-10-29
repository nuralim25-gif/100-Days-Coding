import java.util.Scanner;
public class Day52 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Mau lihat jadwal mata kuliah kamu (Ya/Tidak)? ");
        String jawaban1 = input.nextLine();
        
        while (jawaban1.equalsIgnoreCase("Ya")) {
            System.out.print("\nMau lihat jadwal hari apa (Senin-Jumat)? ");
            String jawaban2 = input.nextLine();
                
            if (jawaban2.equalsIgnoreCase("Senin")) {
                System.out.println("\n=== MATA KULIAH HARI SENIN ===");
                System.out.println("MATA KULIAH\tSKS\tWAKTU\t");
                System.out.println("-----------------------------------");
                System.out.println("Dasar-dasar\t 3 \t09.00-10.30\nPemrograman\t\t");
                System.out.println("-----------------------------------");
                System.out.println("Arsitektur\t \ndan Organisasi\t 2\t13.00-14.30\nKomputer\t\t");
            } else if (jawaban2.equalsIgnoreCase("Selasa")) {
                System.out.println("\n=== MATA KULIAH HARI SELASA ===");
                System.out.println("MATA KULIAH\tSKS\tWAKTU\t");
                System.out.println("-----------------------------------");
                System.out.println("Matematika\t 3 \t13.00-15.15\nDasar\t\t");
            } else if (jawaban2.equalsIgnoreCase("Rabu")) {
                System.out.println("\n=== MATA KULIAH HARI RABU===");
                System.out.println("MATA KULIAH\tSKS\tWAKTU\t");
                System.out.println("-----------------------------------");
                System.out.println("Pengantar\nSistem\t\t 3 \t13.00-15.15\ndan Teknologi\nInformasi\t\t");
            } else if (jawaban2.equalsIgnoreCase("Kamis")) {
                System.out.println("\nKamu tidak ada jadwal di hari Kamis!");
            } else if (jawaban2.equalsIgnoreCase("Jumat")) {
                System.out.println("\n=== MATA KULIAH HARI JUMAT ===");
                System.out.println("MATA KULIAH\tSKS\tWAKTU\t");
                System.out.println("-----------------------------------");
                System.out.println("Pendidikan\t 3\t13.00-15.15\nKewarganegaraan\t\t");
                System.out.println("-----------------------------------");
                System.out.println("Fisika\t\t 2\t13.00-14.30\nElektronika\t\t");
                System.out.println("-----------------------------------");
                System.out.println("Wawasan\nSosial Budaya\t 2\t13.00-14.30\ndan IPTEKS\t\t");
                System.out.println("-----------------------------------");
                System.out.println("Pendidikan\t 2\t13.00-14.30\nAgama Islam\t\t");
            }
                
            System.out.print("\nMau lihat jadwal hari lain? ");
            String jawaban3 = input.nextLine();
                
            if (jawaban3.equalsIgnoreCase("Tidak")) {
                break;
            }
        }
        
        System.out.println("\nTerima kasih sudah berkunjung");
            
    }    
        
}
