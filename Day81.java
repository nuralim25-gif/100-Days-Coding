import java.util.Scanner;
public class Day81 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        String[] buah = new String[5];
        
        System.out.println("Input 5 nama buah: ");
        for (int i = 0; i<buah.length; i++){
            System.out.print("Buah ke-" + (i+1) + " : ");
            buah[i] = sc.nextLine();
        }
        
        boolean[] sudahTampil = new boolean [5];
        String lanjut;
        
        System.out.println("\n\n=== Menampilkan Buah Tertentu ===");
        do {
            System.out.print("\nMau menampilkan buah ke berapa (1/2/3/dst)? ");
            int pilihan = sc.nextInt();
            if (pilihan>=1 && pilihan<=buah.length){
                if (sudahTampil[pilihan-1]){
                    System.out.println("\nBuah sudah ditampilkan!");
                } else {
                    System.out.println("Buah ke-" + pilihan + " : " + buah[pilihan-1]);
                    sudahTampil[pilihan-1] = true;
                }
            } else {
                System.out.println("\nError! Tidak ada buah ke-" + pilihan + ". Hanya ada buah ke-1 hingga buah ke-5.");
            }
            System.out.print("\nIngin menampilkan buah yang lain (ya/tidak)? ");
            lanjut = sc.next();
        } while (lanjut.equalsIgnoreCase("ya"));
        
        System.out.println("\nProgram berakhir. Terima Kasih");
    }
    
}
