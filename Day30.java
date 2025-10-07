import java.util.Scanner;
public class Day30 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        //Patokan
        int alpamaks = 3;
        int nilaimin = 65;
        
        //Inputan
        System.out.print("Masukkan alpa : ");
        int alpa = in.nextInt();
        System.out.print("Masukkan nilai: ");
        int nilai = in.nextInt();
        
        //Operasi Perbandingan
        boolean hasil1 = alpa <= alpamaks;
        boolean hasil2 = nilai >= nilaimin;
       
        //Hasil Perbandingan
        if (hasil1 && hasil2){
            System.out.printf("%nLulus");
        } else {
            System.out.printf("%nMengulang");
        }
        
    }
    
}
