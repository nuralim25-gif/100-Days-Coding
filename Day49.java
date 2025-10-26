import java.util.Scanner;
public class Day49 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        //Inputan
        System.out.print("Input nilai Anda: ");
        double nilai = input.nextDouble();
        
        //Operator Ternary
        String hasil = (nilai>=60) ? "LULUS" : "TIDAK LULUS";
        
        //Menampilkan Hasil
        System.out.print("\nStatus Kelulusan: " + hasil);
    }
    
}
