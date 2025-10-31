import java.util.Scanner;
public class Day54 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan batas awal  : ");
        int a = input.nextInt();
        System.out.print("Masukkan batas akhir : ");
        int b = input.nextInt();
        
        System.out.printf("%nAngka ganjil dari %d-%d:", a, b);
        
        for (int i = a; i<=b; i++) {
            if (i%2==0) {
                continue;
            } else {
                System.out.printf("%n%d", i);
            }
        }
    }
    
}
