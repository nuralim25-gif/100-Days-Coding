import java.util.Scanner;
public class Day25 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        //Meminta inputan angka dari user
        System.out.print("Masukkan sebuah angka: ");
        int angka = input.nextInt();
        
        angka++; //Operasi increment
        System.out.println("\nHasil Increment: " + angka); //Mencetak hasil increment
        
        angka--; //Operasi decrement
        System.out.println("Hasil Decrement: " + angka); //Mencetak hasil decrement
        
        input.close();
    }
    
}
