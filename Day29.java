import java.util.Scanner;
public class Day29 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
       
        //Inputan
        System.out.print("Angka Pertama: ");
        int angka1 = in.nextInt();
        System.out.print("Angka Kedua  : ");
        int angka2 = in.nextInt();
        
        //Operasi Perbandingan
        boolean lebihkecil = angka1 < angka2;
        boolean lebihbesar = angka1 > angka2;
        
        //Hasil Perbandingan
        System.out.printf("%nHasil Perbandingan:%n%d < %d = %b", angka1, angka2, lebihkecil);
        System.out.printf("%n%d > %d = %b", angka1, angka2, lebihbesar);
        
    }
    
}
