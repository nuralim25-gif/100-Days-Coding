import java.util.Scanner;
public class Day90 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Input nama : ");
        String nama = sc.nextLine();
        
        System.out.print("Input umur : ");
        int umur = sc.nextInt();
        
        String hasil = identitas(nama, umur);
        
        System.out.println(hasil);
        
    }
    
    public static String identitas(String nama, int umur) {
        return "\nSelamat datang " + nama + "! Kamu berumur " + umur + " tahun.";
        
    }
    
}
