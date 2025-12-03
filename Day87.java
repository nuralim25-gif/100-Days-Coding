import java.util.Scanner;
public class Day87 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        String[] Buah = {"Apel", "Mangga", "Salak", "Rambutan", "Durian"};
        
        System.out.println("=== Mencari Buah ===");
        System.out.print("Buah yang dicari : ");
        String cari = sc.nextLine();
        
        String hasil = "";
        
        for (int i = 0; i < Buah.length; i++) {
            if (cari.equalsIgnoreCase(Buah[i])) {
                hasil = "Buah ditemukan : " + Buah[i];
                break;
            } else {
                hasil = "Buah tidak ditemukan!";
            }
        }
        
        System.out.println(hasil);
        
    }
    
}
