import java.util.Scanner;
public class Day28 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        //Inputan
        System.out.print("Angka Pertama: ");
        int a = in.nextInt();
        System.out.print("Angka Kedua  : ");
        int b = in.nextInt();
        //Perbandingan
        boolean c = a == b;
        boolean d = a != b;
        //Hasil
        System.out.printf("%nHasil %d == %d: %b", a, b, c);
        System.out.printf("%nHasil %d != %d: %b", a, b, d);
        
    }
    
}
