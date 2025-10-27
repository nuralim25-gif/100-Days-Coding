import java.util.Scanner;
public class Day50 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        //Inputan
        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();
        
        //Menentukan angka ganjil/genap
        String jenis = (angka % 2 == 1) ? "angka ganjil" : "angka genap";
        
        //Menampilkan hasil
        System.out.printf("%n%d adalah %s", angka, jenis);
    }
    
}
