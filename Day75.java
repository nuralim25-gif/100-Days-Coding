import java.util.Scanner;
public class Day75 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Input sebuah teks: ");
        String teks = input.nextLine();
        
        int jKarakter = teks.length();
        String besar = teks.toUpperCase();
        String kecil = teks.toLowerCase();
        
        System.out.println("\nVersi huruf besar : " + besar);
        System.out.println("Versi huruf kecil : " + kecil);
        System.out.println("Jumlah Karakter (termasuk spasi) : " + jKarakter + " karakter");
    }
    
}
