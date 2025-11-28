import java.util.Scanner;
public class Day82 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Jumlah elemen : ");
        int JElemen = sc.nextInt();
        sc.nextLine();
        
        String[] elemen = new String[JElemen];
        
        System.out.println("\nInput " + elemen.length + " nama elemen : ");
        for (int i = 0; i<elemen.length; i++){
            System.out.print("Elemen ke-" + (i+1) + " : ");
            elemen[i] = sc.nextLine();
        }
        
        System.out.println("\n=== Menampilkan Semua Elemen ===");
        for (int i = 0 ; i<elemen.length; i++) {
            System.out.println("Elemen " + (i+1) + " : " + elemen[i] );
        }
    }
    
}
