import java.util.Scanner;
public class Day70 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("=== Membuat Pola Persegi ===");
        System.out.print("Input karakter untuk membuat pola : ");
        char karakter = input.next().charAt(0);
        System.out.print("Input jumlah karakter (Panjang)   : ");
        int panjang = input.nextInt();
        System.out.print("Input jumlah karakter (Lebar)     : ");
        int lebar = input.nextInt();
        
        System.out.printf("%nBerikut pola persegi dengan karakter %c sejumlah %d  karakter (untuk panjang) dan %d karakter (untuk lebar):%n%n", karakter, panjang, lebar);
        for (int i = 0; i<lebar; i++){
            for (int j = 0; j<panjang; j++){
                if (i == 0 || i == lebar-1 || j == 0 || j == panjang-1){
                    System.out.printf("%c ", karakter);
                }else {
                    System.out.printf("  ");
                }
            }
            System.out.println();
        }
    }
    
}
