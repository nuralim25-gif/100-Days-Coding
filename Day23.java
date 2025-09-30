import java.util.Scanner;
public class Day23 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("Menghitung Luas Persegi Panjang");
        
        //Input panjang dan lebar persegi panjang
        System.out.print("Masukkan panjang: ");
        double panjang = input.nextDouble();
        System.out.print("Masukkan lebar  : ");
        double lebar = input.nextDouble();
        
        //Menghitung luas persegi panjang
        double luas = panjang * lebar;
        
        //Mencetak hasil perhitungan
        System.out.println("\nPenyelesain:\nL = P X L\n  = " + panjang + " X " + lebar + "\n  = " + luas);
    }
    
}
