import java.util.Scanner;
public class Day72 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("=== Membuat Pola Segi Tiga Terbalik ===");
        System.out.print("Karakter untuk membuat pola        : ");
        char k = input.next().charAt(0);
        System.out.print("Jumlah karakter untuk panjang sisi : ");
        int s = input.nextInt();
        
        System.out.printf("%nBerikut pola segi tiga siku-siku terbalik dengan karakter %c sejumlah %d karakter untuk panjang masing-masing sisinya:%n", k, s);
        System.out.println("\nSegitiga Terbalik Pertama:");
        for (int i=s; i>=1; i--){
            for (int j=1; j<=s-i; j++){
                System.out.printf(" ");
            }
            for (int l=1; l<=i; l++){
                System.out.printf("%c", k);
            }
            System.out.println();
        }
        
        System.out.println("\nSegitiga Terbalik Kedua:");
        for (int i=s; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.printf("%c", k);
            }
            System.out.println();
        }
    }
    
}
