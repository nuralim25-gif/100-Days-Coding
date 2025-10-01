import java.util.Scanner;
public class Day24 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        double diameter;
        double jarijari;
        double luas;
        //Meminta inputan jari-jari/diameter dari user
        System.out.println("Menghitung Luas Lingkaran");
        System.out.print("Masukkan diameter atau jari-jari.\nJika diameter jawab D, jika jari-jari jawab J: ");
        String jawaban = input.nextLine();
        if ( jawaban.equalsIgnoreCase("d")){
            System.out.print("Masukkan diameter: ");
            diameter = input.nextDouble();
            jarijari = diameter / 2;
        }else {
            System.out.print("Masukkan jari-jari: ");
            jarijari = input.nextDouble();
        } 
        
        //Menghitung luas lingkaran
        luas = Math.PI * jarijari * jarijari;
        
        //Menampilkan hasil perhitungan luas lingkaran
        System.out.printf("\nLuas = %.2f", luas);
        
    }
    
}
