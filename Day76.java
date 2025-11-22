import java.util.Scanner;
public class Day76 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Input teks 1 : ");
        String teks1 = input.nextLine();
        System.out.print("Input teks 2 : ");
        String teks2 = input.nextLine();
        
        System.out.println("\n=== Rincian ===");
        //equals
        System.out.println("1. Apakah teks 1 dan teks 2 sama persis tanpa perbedaan huruf besar dan kecil? " + teks1.equals(teks2));
        
        //equalsIgnoreCase
        System.out.println("2. Apakah teks 1 dan teks 2 sama persis namun ada atau tidak perbedaan huruf besar dan kecil? : " + teks1.equalsIgnoreCase(teks2));
        
        //constains
        System.out.println("3. Apakah teks 1 mengandung teks 2 tanpa perbedaan huruf besar dan kecil? : " + teks1.contains(teks2));
        
        //isEmpty
        System.out.println("4. Apakah teks 1 kosong? " + teks1.isEmpty());
        System.out.println("5. Apakah teks 2 kosong? " + teks2.isEmpty());
    }
    
}
