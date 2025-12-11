import java.util.Scanner;
public class Day95 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Nama      : ");
        String nama = sc.nextLine();
        System.out.print("Umur      : ");
        int umur = sc.nextInt();
        sc.nextLine();
        System.out.print("Pekerjaan : ");
        String pekerjaan = sc.nextLine();
        
        identitas(nama, umur, pekerjaan);
        
    }
    
    public static void identitas (String n, int u, String p) {
        System.out.println("\n=== DATA ANDA ===");
        System.out.println("Nama      : " + n);
        System.out.println("Umur      : " + u + " tahun");
        System.out.println("Pekerjaan : " + p);
        
    }
    
}
