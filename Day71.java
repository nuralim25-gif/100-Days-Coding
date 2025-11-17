import java.util.Scanner;
public class Day71 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("=== Membuat Pola Segi Tiga Siku-siku ===");
        System.out.print("Karakter untuk membuat pola         : ");
        char k = input.next().charAt(0);
        System.out.print("Jumlah karakter untuk sisi segitiga : ");
        int t = input.nextInt();
        
        System.out.printf("%nBerikut pola segi tiga siku-siku dengan karakter %c sebanyak %d karakter untuk panjang sisinya:%n%n", k, t);
        for (int i = 1; i<=t; i++){
            for (int j = 1; j<=i; j++){
                if(i == 1 || j == 1 || j == i || i == t){
                   System.out.printf("%c ", k); 
                }else {
                   System.out.printf("  ");
                }
            }
            System.out.println();
        }
    }
    
}
