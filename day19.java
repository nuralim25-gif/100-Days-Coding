import java.util.Scanner;
public class day19 {
    
    public static void main(String[] args) {
        Scanner inputan = new Scanner (System.in);
        
        System.out.print("Masukkan angka: ");     
        double angkadouble = inputan.nextDouble();
        
        int angkaint = (int) angkadouble;
            
        byte angkabyte = (byte) angkaint;
        
        
        System.out.println("\nHasil Konversi Manual");
        System.out.printf("Angka Double (Awal)   : %.2f%n", angkadouble);      
        System.out.printf("Hasil Konversi ke int : %d%n", angkaint);
        System.out.printf("Hasil Konversi ke byte: %d%n", angkabyte);
            
            
    }
    
}
